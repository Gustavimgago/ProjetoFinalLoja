package org.example.services;

import org.example.dto.ClienteDTO;
import org.example.entities.Cliente;
import org.example.entities.Contato;
import org.example.entities.Endereco;
import org.example.repositories.ClienteRepository;
import org.example.repositories.ContatoRepository;
import org.example.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;


@Service
public class ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ContatoRepository contatoRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Cliente findById(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado com ID: " + id));
    }

    public Cliente save(ClienteDTO clienteDTO) {
        Cliente cliente = fromDTO(clienteDTO);
        return clienteRepository.save(cliente);
    }

    private Cliente fromDTO(ClienteDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setIdCliente(dto.getIdCliente());
        cliente.setNome(dto.getNome());
        cliente.setCpf(dto.getCpf());
        cliente.setDataNascimento(dto.getDataNascimento());
        cliente.setStatusCliente(dto.getStatusCliente());

        return cliente;
    }

    public void delete(Long id){
        clienteRepository.deleteById(id);
    }

    public Cliente update(Long id, ClienteDTO clienteDTO) {
        Cliente cliente = findById(id);

        cliente.setNome(clienteDTO.getNome());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setDataNascimento(clienteDTO.getDataNascimento());
        cliente.setStatusCliente(clienteDTO.getStatusCliente());

        List<Contato> contatos = cliente.getContatos();
        if (contatos != null && !contatos.isEmpty()) {
            for (int i = 0; i < contatos.size(); i++) {
                if (i < clienteDTO.getIdContato().size()) {
                    Long idContato = clienteDTO.getIdContato().get(i);
                    Contato contato = contatoRepository.findById(idContato)
                            .orElseThrow(() -> new EntityNotFoundException("Contato não encontrado com ID: " + idContato));
                    contatos.set(i, contato);
                }
            }
        } else {
            throw new RuntimeException("Cliente não possui contatos associados.");
        }

        List<Endereco> enderecos = cliente.getEnderecos();
        if (enderecos != null && !enderecos.isEmpty()) {
            for (int i = 0; i < enderecos.size(); i++) {
                if (i < clienteDTO.getIdEndereco().size()) {
                    Long idEndereco = clienteDTO.getIdEndereco().get(i);
                    Endereco endereco = enderecoRepository.findById(idEndereco)
                            .orElseThrow(() -> new EntityNotFoundException("Endereço não encontrado com ID: " + idEndereco));
                    enderecos.set(i, endereco);
                }
            }
        } else {
            throw new RuntimeException("Cliente não possui endereços associados.");
        }


        return clienteRepository.save(cliente);
    }

}

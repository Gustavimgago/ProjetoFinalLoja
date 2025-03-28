package org.example.services;

import org.example.dto.FornecedorDTO;
import org.example.entities.Contato;
import org.example.entities.Fornecedor;
import org.example.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<Fornecedor> findAll(){
        return fornecedorRepository.findAll();
    }

    public Fornecedor findById(Long id) {
        Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);
        return fornecedor.orElseThrow(() -> new EntityNotFoundException("Fornecedor não encontrado com ID: " + id));
    }

    public Fornecedor save(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    public void delete(Long id){
        fornecedorRepository.deleteById(id);
    }

    public Fornecedor update(Long id, FornecedorDTO objDto) {
        Fornecedor entity = findById(id);

        entity.setRazaoSocial(objDto.getRazaoSocial());
        entity.setNomeFantasia(objDto.getNomeFantasia());
        entity.setCnpj(objDto.getCnpj());
        entity.setStatusFornecedor(objDto.getStatusFornecedor());

        List<Contato> contatos = entity.getContatos();
        if (!contatos.isEmpty()) {
            Contato contato = contatos.get(0);
            contato.setEmailContato(objDto.getEmailContato());
            contato.setNomeContato(objDto.getNomeContato());
            contato.setCelular(objDto.getCelular());
            contato.setTelefone(objDto.getTelefone());
        } else {
            throw new RuntimeException("Fornecedor não possui contatos associados.");
        }

        return fornecedorRepository.save(entity);
    }

}

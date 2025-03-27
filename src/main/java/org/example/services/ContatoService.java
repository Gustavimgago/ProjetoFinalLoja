package org.example.services;

import org.example.entities.Contato;
import org.example.repositories.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;
    public List<Contato> findAll(){
        return contatoRepository.findAll();
    }

    public Optional<Contato> findById(Long id){
        return contatoRepository.findById(id);
    }

    public Contato save(Contato contato){
        return contatoRepository.save(contato);
    }

    public void delete(Long id){
        contatoRepository.deleteById(id);
    }

}

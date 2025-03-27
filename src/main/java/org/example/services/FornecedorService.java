package org.example.services;

import org.example.entities.Fornecedor;
import org.example.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public List<Fornecedor> findAll(){
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> findById(Long id){
        return fornecedorRepository.findById(id);
    }

    public Fornecedor save(Fornecedor fornecedor){
        return fornecedorRepository.save(fornecedor);
    }

    public void delete(Long id){
        fornecedorRepository.deleteById(id);
    }

}

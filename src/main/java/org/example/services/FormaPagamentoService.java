package org.example.services;

import org.example.entities.FormaPagamento;
import org.example.repositories.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormaPagamentoService {
     @Autowired
    private FormaPagamentoRepository formaPagamentoRepository;

    public List<FormaPagamento> findAll(){
        return formaPagamentoRepository.findAll();
    }

    public Optional<FormaPagamento> findById(Long id){
        return formaPagamentoRepository.findById(id);
    }

    public FormaPagamento save(FormaPagamento formaPagamento){
        return formaPagamentoRepository.save(formaPagamento);
    }

    public void delete(Long id){
        formaPagamentoRepository.deleteById(id);
    }
}



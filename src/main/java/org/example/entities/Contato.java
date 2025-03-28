package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTATO")
    private Long IdContato;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CONT_FORN_ID")
    private Fornecedor conFornecedor;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private Cliente cliente;

    @Column(length = 15 ,name = "TELEFONE" , nullable = false)
    private String telefone;

    @Column(length = 15, name = "CELULAR" , nullable = false)
    private String celular;

    @Column(name = "NOME_CONTATO" , nullable = false)
    private String nomeContato;

    @Column(name = "EMAIL_CONTATO" , nullable = false)
    private String emailContato;

    public Contato() {
    }

    public Contato(Long idContato, Fornecedor conFornecedor, String telefone, String celular, String nomeContato, String emailContato) {
        IdContato = idContato;
        this.conFornecedor = conFornecedor;
        this.telefone = telefone;
        this.celular = celular;
        this.nomeContato = nomeContato;
        this.emailContato = emailContato;
    }

    public Long getIdContato() {
        return IdContato;
    }

    public void setIdContato(Long idContato) {
        IdContato = idContato;
    }

    public Fornecedor getConFornecedor() {
        return conFornecedor;
    }

    public void setConFornecedor(Fornecedor conFornecedor) {
        this.conFornecedor = conFornecedor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
}

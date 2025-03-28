package org.example.dto;

import java.io.Serializable;

public class FornecedorDTO implements Serializable {


    private Long IdFornecedor;

    private String razaoSocial;

    private String nomeFantasia;

    private String cnpj;

    private String statusFornecedor;

//---------------------------------------------------------

    private Long IdContato;

    private String telefone;

    private String celular;

    private String nomeContato;


    private String emailContato;


    public FornecedorDTO() {
    }

    public Long getIdFornecedor() {
        return IdFornecedor;
    }

    public void setIdFornecedor(Long idFornecedor) {
        IdFornecedor = idFornecedor;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStatusFornecedor() {
        return statusFornecedor;
    }

    public void setStatusFornecedor(String statusFornecedor) {
        this.statusFornecedor = statusFornecedor;
    }

    public Long getIdContato() {
        return IdContato;
    }

    public void setIdContato(Long idContato) {
        IdContato = idContato;
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

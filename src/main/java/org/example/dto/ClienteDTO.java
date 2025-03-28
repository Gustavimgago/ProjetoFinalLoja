package org.example.dto;

import org.example.entities.Contato;
import org.example.entities.Endereco;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class ClienteDTO implements Serializable {


    private Long IdCliente;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String statusCliente;

    private List<Long> idContato;
    private String telefone;
    private String celular;
    private String nomeContato;
    private String emailContato;

    private List<Long> idEndereco;
    private String longradouro;
    private String numeroEndereco;
    private int cepEndereco;
    private String estado;
    private String cidade;
    private String bairro;
    private String complemento;

    public ClienteDTO() {
    }

    public Long getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Long idCliente) {
        IdCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getStatusCliente() {
        return statusCliente;
    }

    public void setStatusCliente(String statusCliente) {
        this.statusCliente = statusCliente;
    }

    public List<Long> getIdContato() {
        return idContato;
    }

    public void setIdContato(List<Long> idContato) {
        this.idContato = idContato;
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

    public List<Long> getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(List<Long> idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getLongradouro() {
        return longradouro;
    }

    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public int getCepEndereco() {
        return cepEndereco;
    }

    public void setCepEndereco(int cepEndereco) {
        this.cepEndereco = cepEndereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}

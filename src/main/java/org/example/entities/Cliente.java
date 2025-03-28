package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long IdCliente;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Contato> contatos = new ArrayList<>();

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Endereco> enderecos = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "ID_CONTATO" , nullable = false)
    private Contato contato;

    @OneToOne
    @JoinColumn(name = "ID_ENDERECO" , nullable = false)
    private Endereco endereco;

    @Column(length = 55, name = "NOME_CLIENTE", nullable = false)
    private String nome;

    @Column( name = "CPF_CNPJ", nullable = false)
    private String cpf;

    @Column( name = "DATA_NASCIMENTO", nullable = false)
    private LocalDate dataNascimento;

    @Column( name = "STATUS_CLIENTE" , nullable = false)
    private String statusCliente;


    public Cliente() {
    }

    public Cliente(Long idCliente, Contato contato, Endereco endereco, String nome, String cpf, LocalDate dataNascimento, String statusCliente) {
        IdCliente = idCliente;
        this.contato = contato;
        this.endereco = endereco;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.statusCliente = statusCliente;
    }

    public Long getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Long idCliente) {
        IdCliente = idCliente;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}

package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Cliente implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long IdCliente;

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

    public Cliente(Long idCliente, String nome, String cpf, LocalDate dataNascimento, String statusCliente) {
        IdCliente = idCliente;
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
}

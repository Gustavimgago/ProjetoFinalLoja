package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Long IdEndereco;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private Cliente cliente;

    @Column(name = "LONGRADOURO" , nullable = false)
    private String longradouro;

    @Column(name = "NUMERO_ENDERECO" , nullable = false)
    private String numeroEndereco;

    @Column(name = "CEP_ENDERECO" , nullable = false)
    private int cepEndereco;

    @Column(name = "ESTADO" , nullable = false)
    private String estado;

    @Column(name = "CIDADE" , nullable = false)
    private String cidade;

    @Column(name = "BAIRRO" , nullable = false)
    private String bairro;

    @Column(name = "COMPLEMENTO" , nullable = false)
    private String complemento;

    public Endereco() {
    }

    public Endereco(Long idEndereco, String longradouro, String numeroEndereco, int cepEndereco, String estado, String cidade, String bairro, String complemento) {
        IdEndereco = idEndereco;
        this.longradouro = longradouro;
        this.numeroEndereco = numeroEndereco;
        this.cepEndereco = cepEndereco;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.complemento = complemento;
    }

    public Long getIdEndereco() {
        return IdEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        IdEndereco = idEndereco;
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

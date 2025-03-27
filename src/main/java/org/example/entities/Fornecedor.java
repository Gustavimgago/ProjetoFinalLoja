package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORNECEDOR")
    private Long IdFornecedor;

    @Column(name = "RAZAO_SOCIAL", nullable = false)
    private String razaoSocial;

    @Column(name = "NOME_FANTASIA", nullable = false)
    private String nomeFantasia;

    @Column(name = "CNPJ", nullable = false)
    private int cnpj;

    @Column(name = "STATUS_FORNECEDOR", nullable = false)
    private String statusFornecedor;

    public Fornecedor() {
    }

    public Fornecedor(Long idFornecedor, String razaoSocial, String nomeFantasia, int cnpj, String statusFornecedor) {
        IdFornecedor = idFornecedor;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.statusFornecedor = statusFornecedor;
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

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getStatusFornecedor() {
        return statusFornecedor;
    }

    public void setStatusFornecedor(String statusFornecedor) {
        this.statusFornecedor = statusFornecedor;
    }
}


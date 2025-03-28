package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long IdProduto;

    @ManyToOne
    @JoinColumn(name = "ID_FORNECEDOR", nullable = false)
    private Fornecedor fornecedor;

    @Column(name = "DESCRICAO_PRODUTO", nullable = false)
    private String descricaoProduto;

    @Column(name = "PRECO_CUSTO", nullable = false)
    private double precoCusto;

    @Column(name = "PRECO_VENDA", nullable = false)
    private double precoVenda;

    @Column(name = "ESTOQUE", nullable = false)
    private int estoque;

    public Produto() {
    }

    public Produto(Long idProduto, Fornecedor fornecedor, String descricaoProduto, double precoCusto, double precoVenda, int estoque) {
        IdProduto = idProduto;
        this.fornecedor = fornecedor;
        this.descricaoProduto = descricaoProduto;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
    }

    public Long getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(Long idProduto) {
        IdProduto = idProduto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
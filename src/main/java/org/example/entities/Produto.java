package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long IdProduto;

    @Column(name = "DESCRICAO_PRODUTO" , nullable = false)
    private String descricaoProduto;

    @Column(name = "PRECO_CUSTO" , nullable = false)
    private double precoCusto;

    @Column(name = "PRECO_VENDA" , nullable = false)
    private double precoVenda;

    @Column(name = "ESTOQUE" , nullable = false)
    private int estoque;

}

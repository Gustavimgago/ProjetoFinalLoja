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

}


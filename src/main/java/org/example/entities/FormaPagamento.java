package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class FormaPagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORMAPAGAMENTO")
    private Long IdFormaPagamento;

    @Column(name = "DESCRICAO" , nullable = false)
    private String descricao;

    @Column(name = "TIPO" , nullable = false)
    private String tipo;

    @Column(name = "STATUS_FP" , nullable = false)
    private String statusFP;

}

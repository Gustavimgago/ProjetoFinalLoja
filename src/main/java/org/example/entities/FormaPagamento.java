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

    public FormaPagamento() {
    }

    public FormaPagamento(Long idFormaPagamento, String descricao, String tipo, String statusFP) {
        IdFormaPagamento = idFormaPagamento;
        this.descricao = descricao;
        this.tipo = tipo;
        this.statusFP = statusFP;
    }

    public Long getIdFormaPagamento() {
        return IdFormaPagamento;
    }

    public void setIdFormaPagamento(Long idFormaPagamento) {
        IdFormaPagamento = idFormaPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatusFP() {
        return statusFP;
    }

    public void setStatusFP(String statusFP) {
        this.statusFP = statusFP;
    }
}

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

}

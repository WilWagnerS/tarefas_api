package br.senac.sc.tarefas_api.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Tarefas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    private String descricao;

    @Column(nullable = false)
    private LocalDate dataInicio;

    private LocalDate dataFinal;

    @Column(nullable = false)
    private String autor;

}

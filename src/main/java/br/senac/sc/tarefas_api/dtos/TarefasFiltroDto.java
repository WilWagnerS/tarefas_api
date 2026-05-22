package br.senac.sc.tarefas_api.dtos;

import java.time.LocalDate;

public class TarefasFiltroDto {

    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private String autor;

    public TarefasFiltroDto(String nome, String autor, LocalDate dataFinal, LocalDate dataInicio, String descricao) {
        this.nome = nome;
        this.autor = autor;
        this.dataFinal = dataFinal;
        this.dataInicio = dataInicio;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}

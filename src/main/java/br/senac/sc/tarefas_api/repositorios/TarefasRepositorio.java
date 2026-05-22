package br.senac.sc.tarefas_api.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TarefasRepositorio<Tarefas> extends JpaRepository<Tarefas, Long> {
    List<Tarefas> findByDataInicio(LocalDate dataInicio);
    List<Tarefas> findByNomeContaining(String nome);
}

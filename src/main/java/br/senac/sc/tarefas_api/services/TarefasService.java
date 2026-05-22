package br.senac.sc.tarefas_api.services;

import br.senac.sc.tarefas_api.dtos.TarefasFiltroDto;
import br.senac.sc.tarefas_api.entidades.Tarefas;
import br.senac.sc.tarefas_api.repositorios.TarefasRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefasService {
    private TarefasRepositorio tarefasRepositorio;

    public TarefasService(TarefasRepositorio tarefasRepositorio) {this.tarefasRepositorio = tarefasRepositorio; }

    public List<Tarefas> listar(TarefasFiltroDto filtro) {
        if(filtro.getNome() != null) {
            return tarefasRepositorio.findByNomeContaining(filtro.getNome());
        }

        if (filtro.getDescricao() != null) {
            return tarefasRepositorio.findByDataInicio(filtro.getDataInicio());
        }


    }
}

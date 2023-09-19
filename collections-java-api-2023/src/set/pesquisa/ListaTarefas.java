package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        tarefaSet = new HashSet<>();
    }

    //adcionar tarefa
    public void adcionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    //remover tarefa
    public void removerTarefa(String descricao){
        for (Tarefa tarefa : tarefaSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefaSet.remove(tarefa);
                System.out.println("Removendo Tarefa: " + tarefa);
                break;
            }
        }
    }

    //exibir tarefa
    public void exibirTarefa(){
        System.out.println(tarefaSet);
    }

    //contar tarefa
    public int contarTarefa(){
        return tarefaSet.size();
    }

    //obter tarefas concluidas

    //obter tarefas pendentes

    //marcar tarefa como conlcuida

    // marcar tarefa pendente

    //limpar lista tarefas


    
}

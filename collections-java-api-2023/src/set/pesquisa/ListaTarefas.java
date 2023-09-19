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
        boolean tarefaNaoEncontrada = true;

        if(!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaSet.remove(tarefa);
                    System.out.println("Removendo Tarefa: " + tarefa);
                    tarefaNaoEncontrada = false;
                    break;
                }
            }

            if(tarefaNaoEncontrada)
            System.out.println("Tarefa não Encontrada");

        }else{
            System.out.println("Lista Vazia!");
        }       

    }

    //exibir tarefa
    public void exibirTarefa(){
        if(!tarefaSet.isEmpty()){
            System.out.println(tarefaSet);
        }else{
            System.out.println("Lista Vazia");
        }
        
    }

    //contar tarefa
    public int contarTarefa(){
        return tarefaSet.size();
    }

    //obter tarefas concluidas
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for(Tarefa tarefa: tarefaSet){
            if(tarefa.isConcluido()){
                tarefasConcluidas.add(tarefa);
            }
        }

        return tarefasConcluidas;
    }

    //obter tarefas pendentes
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa tarefa : tarefasPendentes) {
            if(!tarefa.isConcluido()){
                tarefasPendentes.add(tarefa);
            }
        }

        return tarefasPendentes;
    }

    //marcar tarefa como conlcuida
    public void marcarTarefaConcluida(String descricao){
        if(!tarefaSet.isEmpty()){
            for (Tarefa tarefa : tarefaSet) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefa.setConcluido(true);
                }
            }
        }else{
            System.out.println("Lista Vazia!");
        }
    }

    // marcar tarefa pendente

    //limpar lista tarefas


    
}

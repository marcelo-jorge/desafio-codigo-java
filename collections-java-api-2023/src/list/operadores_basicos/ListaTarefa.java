package list.operadores_basicos;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    //atributo lista de tarefas
    private List<Tarefa> listaDeTarefas;

    //construtor da classe
    public ListaTarefa(){
        this.listaDeTarefas = new ArrayList<>();
    }

    //metodo adicionar nova tarefa
    public void adcionarTarefa(String descricao){
        listaDeTarefas.add(new Tarefa(descricao));
    }

    //metodo remover tarefas
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        //verifica se a lista esta vazia do contrario continua
        if(!listaDeTarefas.isEmpty()){
            for (Tarefa tarefa : listaDeTarefas) {
                //verifica se existe a descricao na lista
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(tarefa);
                }
                
            }
            //remover todas as descricoes caso exista mais de uma
            listaDeTarefas.removeAll(tarefasParaRemover);
        }else{
            System.out.println("Lista esta Vazia");
        }
    }

    //metodo obter numero total de tarefas
    public int obterNumeroTotalTarefas(){
        return listaDeTarefas.size();
    }

    //metodo obter descricoes tarefas
    public void obterDescricoesTarefas(){
        //verifica se a lista esta vazia
        if(listaDeTarefas.isEmpty()){
            System.out.println("Lista esta vazia");
        }else{
            System.out.println(listaDeTarefas);
        }
    } 

    //testando codigo
    public static void main(String[] args){

        ListaTarefa listaTarefa = new ListaTarefa();

        //metodo adicionar nova tarefa
        listaTarefa.adcionarTarefa("tarefa 1");
        listaTarefa.adcionarTarefa("tarefa 2");
        listaTarefa.adcionarTarefa("tarefa 3");
        listaTarefa.adcionarTarefa("tarefa 4");
        System.out.println("numero de tarefas na lista: " + listaTarefa.obterNumeroTotalTarefas());

        //metodo remover nova tarefa
        listaTarefa.removerTarefa("tarefa 3");
        listaTarefa.removerTarefa("tarefa 1");
        
        //metodo total de  tarefas
        System.out.println("numero de tarefas na lista: " + listaTarefa.obterNumeroTotalTarefas());

        //metodo descrição das tarefas
        listaTarefa.obterDescricoesTarefas();        
    }
}

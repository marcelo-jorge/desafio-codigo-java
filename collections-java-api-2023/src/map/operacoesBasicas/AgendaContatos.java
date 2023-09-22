package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos{

    //atributos Nome,Numero Telefone
    private Map<String,Integer> agendaContatoMap;

    // quando instancioado gera um map vazio
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    // adcionar contato
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    //remove contato
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }else{
            System.out.println("Map esta Vazio");
        }
    }

    //exibir contato
    public void exibirContato(){
        if(!agendaContatoMap.isEmpty()){
            System.out.println(agendaContatoMap);
        }else{
            System.out.println("Map esta Vazio");
        }
    }

    //pesquisar por nome e retorna numero
    public Integer pesquisarPorNome(String nome){
        if(!agendaContatoMap.isEmpty()){
            if(agendaContatoMap.get(nome) == null){
                System.out.println("Nome não encontrado");
                return null;
            }else{
                return agendaContatoMap.get(nome);
            }            
        }else{
            System.out.println("Map esta Vazio");
            return null;
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        // inserir contatos
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContato();
    }
}
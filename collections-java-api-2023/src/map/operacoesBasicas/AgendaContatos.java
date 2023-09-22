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
            if(agendaContatoMap.remove(nome) == null) {
                System.out.println("contato não encontrado");
            }            
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
                System.out.println("Nome: "+ nome + " não encontrado");
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

        System.out.println("Exibindo contatos adicionados no Map");
        agendaContatos.exibirContato();

        agendaContatos.removerContato("Maria");
        System.out.println("Exibindo contatos Depois de Remover");
        agendaContatos.exibirContato();

        //pesquisa por nome
        String nomePesquisa = "João";        
        System.out.println("Numero de telefone de " + nomePesquisa + ":" + agendaContatos.pesquisarPorNome(nomePesquisa));
        
        String nomePesquisaNaoExistente = "Marcelo";        
        System.out.println("Numero de telefone de " + nomePesquisaNaoExistente + ":" + agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente));
    

    }
}
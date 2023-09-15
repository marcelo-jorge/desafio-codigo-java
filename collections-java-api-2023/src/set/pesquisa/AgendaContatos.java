package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    Set<Contato> agenContatosSet;

    public AgendaContatos() {
        agenContatosSet = new HashSet<>();
    }

    //adicionar
    public void adicionarContato(String nome, int numero){
        agenContatosSet.add(new Contato(nome, numero));
    }

    //exibir
    public void exibirContatos(){
        System.out.println(agenContatosSet);
    }

    //pesquisar por nome
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> pesquisarPorNomeSet = new HashSet<>();
        
        for (Contato contato : agenContatosSet) {
            if(contato.getNome().startsWith(nome)){
                pesquisarPorNomeSet.add(contato);
            }
        }
        return pesquisarPorNomeSet;
    }

    //atualizar contato
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato atualizado = null;

        for(Contato contato: agenContatosSet){
            if(contato.getNome() == nome){
                contato.setNumero(novoNumero);
                atualizado = contato;
            }
        }
        return atualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        
        //adicionar
        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);
        agendaContatos.adicionarContato("Ana", 777777777);

        //exibir
        agendaContatos.exibirContatos();

        //pesquisar por nome
        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        //atualizar contato
        Contato contato = agendaContatos.
                        atualizarNumeroContato("Ana",1234567);
        System.out.println("numero atualizado: " + contato);

        agendaContatos.exibirContatos();
    }
    
    
}

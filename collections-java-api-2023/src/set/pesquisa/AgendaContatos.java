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

    //adicionar
    //exibir
    //pesquisar por nome
    //atualizar contato
    
}

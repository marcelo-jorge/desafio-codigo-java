package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    
    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();        
    }

    //adcionar
    public void adicionarPalavra(String palavra){
        conjuntoPalavrasUnicas.add(palavra);
    }

    //remover
    public void removerPalavra(String palavra){
        conjuntoPalavrasUnicas.remove(palavra);
    }

    //verificar
    public boolean verificarPalavra(String palavra){
        return conjuntoPalavrasUnicas.contains(palavra);
    }

    //exibir
    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavrasUnicas);
    }
    
}

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
        System.out.println("Removendo: " + palavra);
    }

    //verificar
    public boolean verificarPalavra(String palavra){        
        return conjuntoPalavrasUnicas.contains(palavra);
    }

    //exibir
    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavrasUnicas);
    }

    public static void main(String[] args) {
        
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        //adcionar
        conjuntoPalavrasUnicas.adicionarPalavra("Marcelo");
        conjuntoPalavrasUnicas.adicionarPalavra("Jose");
        conjuntoPalavrasUnicas.adicionarPalavra("Alfredo");
        conjuntoPalavrasUnicas.adicionarPalavra("Gustavo");
        conjuntoPalavrasUnicas.adicionarPalavra("Augusto");
        conjuntoPalavrasUnicas.adicionarPalavra("Adriano");
        conjuntoPalavrasUnicas.adicionarPalavra("Alfredo");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //remover
        conjuntoPalavrasUnicas.removerPalavra("Alfredo");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //verificar
        System.out.println("Marcelo esta no conjunto: " + conjuntoPalavrasUnicas.verificarPalavra("Marcelo"));        

        //exibir
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
    
}

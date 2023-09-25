package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    //atributo map de palvra e quantidade de vezes
    private Map<String,Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavras(String linguagem, Integer contagem){
        palavras.put(linguagem, contagem);
    }

    public void removerPalavra(String palavra){
        if(!palavra.isEmpty()){
            palavras.remove(palavra);
            System.out.println("Removendo palavra: " + palavra);
        }else{
            System.out.println("o Map esta vazio.");
        }
    }

    public Integer exibirContagemPalavras(){
        int contagemTotal = 0;
        for (Integer contagem: palavras.values()){
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;

        for(Map.Entry<String,Integer> entry: palavras.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }

        return linguagemMaisFrequente;
    }
    
    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavras("Java", 2);
        contagemPalavras.adicionarPalavras("Python", 8);
        contagemPalavras.adicionarPalavras("JavaScript", 1);
        contagemPalavras.adicionarPalavras("C#", 6);

        System.out.println(contagemPalavras.palavras);
    }
}

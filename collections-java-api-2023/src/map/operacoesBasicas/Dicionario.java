package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionario;
    
    //cria um map quando instanciado
    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    //adicionar palavra
    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    //remover palavra
    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
        }else{
            System.out.println("Dicionario esta Vazio.");
        }
    }

    //pesquisar por palavra
    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionario.get(palavra);
        if(definicao != null){
            return definicao;
        }else{
            return "Palavra não encontrada no dicionario";
        }
    }

    public void exibirPalavras(){
        if(!dicionario.isEmpty()){
            System.out.println(dicionario);
        }else{
            System.out.println("O dicionario esta vazio.");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        //adcionar palavras
        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavras();
    }

}

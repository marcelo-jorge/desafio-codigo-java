package map.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {
    private Map<String,Livro> livros;

    public LivrariaOnline(){
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livros.put(link, livro);
    }

    public void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();

        for(Map.Entry<String,Livro> entry: livros.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                chavesRemover.add(entry.getKey());
            }
        }

        for(String chave: chavesRemover){
            livros.remove(chave);
            System.out.println("Removendo chave: " + chave);
        }
    }

    public Map<String,Livro> exibirLivrosOrdenadosPorPreco(){
        //cria uma list de Maps do conjunto do tipo Set recebendo a lista original
        List<Map.Entry<String,Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

        //ordena a lista livrosparaordenarporpreco
        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        //cria um map para receber a lista ordenada
        Map<String,Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        //preenche o map com os valores da lista de livros ordenados
        for(Map.Entry<String,Livro> entry: livrosParaOrdenarPorPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        //retorna lista ordenada
        return livrosOrdenadosPorPreco;
    }

    public Map<String,Livro> exibirLivrosOrdenadosPorAutor(){
        List<Map.Entry<String,Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String,Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for(Map.Entry<String,Livro> entry: livrosParaOrdenarPorAutor){
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public Map<String,Livro> pesquisarLivrosPorAutor(String autor){
        Map<String,Livro> livrosPorAutor = new LinkedHashMap<>();

        for(Map.Entry<String,Livro> entry: livros.entrySet()){
            Livro livro = entry.getValue();
            if(livro.getAutor().equals(autor)){
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }
    
}

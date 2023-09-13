package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    List<Livro> catalagodeLivros;

    public CatalagoLivros(){
        catalagodeLivros = new ArrayList<>();
    }

    //Adiciona um livro ao catálogo.
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalagodeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    //Pesquisa livros por autor e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorAutor(String autor){
        
        List<Livro> listaPesquisaPorAutor = new ArrayList<>();
        
        if(!catalagodeLivros.isEmpty()){
            for(Livro livro: catalagodeLivros){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    listaPesquisaPorAutor.add(livro);
                }
            }            
        }else{
            System.out.println("Catalago esta Vazio.");
        }

        return listaPesquisaPorAutor;
    }

    //Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaPesquisaPorIntervalo = new ArrayList<>();

        if(!catalagodeLivros.isEmpty()){
            for(Livro livro:catalagodeLivros){
                if(livro.getAnoDePublicacao() >= anoInicial && livro.getAnoDePublicacao() <= anoFinal){
                    listaPesquisaPorIntervalo.add(livro);
                }
            }
        }else{
            System.out.println("Catalago esta Vazio");
        }
        
        return listaPesquisaPorIntervalo;
    }

    //Pesquisa livros por título e retorna o primeiro livro encontrado.
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPesquisarPorTitulo = null;

        if(!catalagodeLivros.isEmpty()){
            for(Livro livro: catalagodeLivros){
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPesquisarPorTitulo = livro;
                }
            }
        }else{
            System.out.println("Catalago esta Vazio");
        }

        return livroPesquisarPorTitulo;
    }

}






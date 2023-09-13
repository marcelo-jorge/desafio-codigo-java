package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {

    private List<Livro> catalagodeLivros;

    public CatalagoLivros(){
        this.catalagodeLivros = new ArrayList<>();
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
                    break;
                }
            }
        }else{
            System.out.println("Catalago esta Vazio");
        }

        return livroPesquisarPorTitulo;
    }

    public void findAll(){
        System.out.println(catalagodeLivros);
    }

    public static void main(String[] args){
        //testando a classe
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        //adcionando livros
        catalagoLivros.adicionarLivro("titulo 1", "autor 1", 2020);
        catalagoLivros.adicionarLivro("titulo 1", "autor 2", 2021);
        catalagoLivros.adicionarLivro("titulo 2", "autor 2", 2022);
        catalagoLivros.adicionarLivro("titulo 3", "autor 3", 2023);
        catalagoLivros.adicionarLivro("titulo 4", "autor 4", 2024);
        catalagoLivros.adicionarLivro("titulo 5", "autor 5", 2000);

        catalagoLivros.findAll();

        //Pesquisa livros por autor e retorna uma lista com os livros encontrados.
        System.out.println(catalagoLivros.pesquisarPorAutor("autor 4"));

        //Pesquisa livros por título e retorna o primeiro livro encontrado.
        System.out.println(catalagoLivros.pesquisarPorTitulo("titulo 1"));

        //Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2022, 2024));
        
    }
}






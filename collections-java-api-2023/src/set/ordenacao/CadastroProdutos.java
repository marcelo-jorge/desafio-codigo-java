package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        produtoSet = new HashSet<>();
    }

    //adcionar Produto
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    //exibir produto por nome
    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        if(!produtosPorNome.isEmpty()){
            return produtosPorNome;
        }else{
            System.out.println("Lista esta vazia!");
            return produtosPorNome;
        }        
    }
    
    // exibir produto por preco
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        
        if(!produtoSet.isEmpty()){            
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        }else{
            System.out.println("Lista vazia!");
            return produtosPorPreco;
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
    
        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
    
        // Exibindo todos os produtos no cadastro
        System.out.println("Lista de Todos os produtos:");
        System.out.println(cadastroProdutos.produtoSet);
    
        // Exibindo produtos ordenados por nome
        System.out.println("Ordenação de produtos por nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());
    
        // Exibindo produtos ordenados por preço
        System.out.println("Ordenação de produtos por preco:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
      }
}

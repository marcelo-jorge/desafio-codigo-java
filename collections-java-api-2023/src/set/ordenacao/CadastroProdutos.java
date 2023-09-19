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
        if(!produtosPorPreco.isEmpty()){
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        }else{
            System.out.println("Lista vazia!");
            return produtosPorPreco;
        }
    }
}

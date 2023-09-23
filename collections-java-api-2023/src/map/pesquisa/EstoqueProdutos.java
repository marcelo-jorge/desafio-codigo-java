package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    //adcionar
    public void adcionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    //exibir
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);        
    }

    //calcular valor total estoque
    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }
    
    //obter produto mais caro
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiopreco = Double.MIN_VALUE;
        for(Produto p: estoqueProdutosMap.values()){
            if(p.getPreco() > maiopreco){
                produtoMaisCaro = p;
                maiopreco = p.getPreco();
            }
        }
        return produtoMaisCaro;
    }

    //obter produto mais barato
    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Produto p: estoqueProdutosMap.values()) {
            if(p.getPreco() < menorPreco){
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }

        return produtoMaisBarato;
    }

    //obter produto maior quantidade valor total no estoque
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMQVE = null;
        double maiorVTPE = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Map.Entry<Long,Produto> entry: estoqueProdutosMap.entrySet()){
                double valorPEE = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if(valorPEE > maiorVTPE){
                    maiorVTPE = valorPEE;
                    produtoMQVE = entry.getValue();
                }
            }
        }
        return produtoMQVE;
    }
}

package list.operadores_basicos;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }

    //adicionarItem(String nome, double preco, int quantidade)
    public void adcionarItem(String nome,double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
        System.out.println("adicionando " + nome + " no carrinho.");
    }

    //removerItem(String nome)
    public void removerItem(String nome){      

        if(!carrinhoDeCompras.isEmpty()){
            List<Item> removerTodos = new ArrayList<>();
            
            for(Item item: carrinhoDeCompras){
                if(item.getNome().equals(nome)){
                    removerTodos.add(item);
                }                            
            }
            System.out.println("Removendo todos os itens " + nome + " encontrados no Carrinho.");
            carrinhoDeCompras.removeAll(removerTodos);
        }else{
            System.out.println("Carrinho Vazio");
        }
    }

    //calcularValorTotal()
    public double calcularValorTotal(){
        double valorTotal = 0;

        for(Item item: carrinhoDeCompras){
            valorTotal += item.getPreco();
        }

        return valorTotal;
    }

    //exibirItens()
    public void exibirItens(){
        if(carrinhoDeCompras.isEmpty()){
            System.out.println("Carrinho Vazio");            
        }else{
            System.out.println("Lista de intens do carrinho:");
            System.out.println(carrinhoDeCompras);
        }
        
    }

    //testando classe
    public static void main(String[] args){

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //adicionarItem
        carrinhoDeCompras.adcionarItem("bola", 50.50, 20);
        carrinhoDeCompras.adcionarItem("chupeta", 40, 30);
        carrinhoDeCompras.adcionarItem("blusa", 35.8, 15);
        carrinhoDeCompras.adcionarItem("chupeta", 100, 2);        
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho R$: " + carrinhoDeCompras.calcularValorTotal());
        
        //removerItem
        carrinhoDeCompras.removerItem("blusa");

        //calcularValorTotal e exibir itens
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total do carrinho R$: " + carrinhoDeCompras.calcularValorTotal());
        
    }

}

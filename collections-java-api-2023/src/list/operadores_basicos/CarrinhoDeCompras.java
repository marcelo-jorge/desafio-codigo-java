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
            System.out.println(carrinhoDeCompras);
        }
        
    }
    
}

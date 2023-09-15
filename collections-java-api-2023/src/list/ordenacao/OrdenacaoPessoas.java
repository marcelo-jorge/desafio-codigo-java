package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adcionarPessoa(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(listaPorIdade);
        return listaPorIdade;
    }
    
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(listaPorAltura, new ComparatorPorAltura());
        return listaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        //adcionar Pessoas
        ordenacaoPessoas.adcionarPessoa("nome 1", 25, 1.80);
        ordenacaoPessoas.adcionarPessoa("nome 2", 26, 1.60);
        ordenacaoPessoas.adcionarPessoa("nome 3", 30, 1.90);
        ordenacaoPessoas.adcionarPessoa("nome 4", 28, 1.70);
        ordenacaoPessoas.adcionarPessoa("nome 5", 18, 1.60);
        System.out.println(ordenacaoPessoas.listaDePessoas);
        
        //Ordenar por Idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        //Ordenar por Altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}

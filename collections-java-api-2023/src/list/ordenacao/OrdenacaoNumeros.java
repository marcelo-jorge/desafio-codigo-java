package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaDeInteiros;

    public OrdenacaoNumeros() {
        this.listaDeInteiros = new ArrayList<>();
    }

    //adcionar numero
    public void adicionarNumero(Integer n){
        listaDeInteiros.add(n);
    }
    
    //ordenar ascendente
    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(listaDeInteiros);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }

    //ordenar descendente
    public List<Integer> ordenarDescendente(){
        List<Integer> listaDescendente = new ArrayList<>(listaDeInteiros);
        Collections.sort(listaDescendente);
        return listaDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        //adcionar numero
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(7);
        System.out.println("Lista Original: " + ordenacaoNumeros.listaDeInteiros);
        
        //ordenar ascendente
        System.out.println("Lista ordem crescente: " + ordenacaoNumeros.ordenarAscendente());
        
        //ordenar descendente
        System.out.println("Lista ordem decrescente: " + ordenacaoNumeros.ordenarDescendente());        
    }   
}

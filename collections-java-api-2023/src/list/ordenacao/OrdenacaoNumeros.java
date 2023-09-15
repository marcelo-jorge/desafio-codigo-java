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

       

    //adcionar numero
    //ordenar ascendente
    //ordenar descendente
}

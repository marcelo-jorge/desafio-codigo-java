package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
}

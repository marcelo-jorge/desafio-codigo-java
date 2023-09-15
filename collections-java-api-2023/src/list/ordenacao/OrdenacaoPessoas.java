package list.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adcionarPessoa(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    
    
}

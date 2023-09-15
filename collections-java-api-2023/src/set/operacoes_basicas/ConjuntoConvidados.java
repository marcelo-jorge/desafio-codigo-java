package set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    Set<Convidado> conjutoConvidados;

    public ConjuntoConvidados() {
        this.conjutoConvidados = new HashSet<>();
    }

    public void adcionarConvidado(String nome,int codigoConvite){
        conjutoConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite){
        for (Convidado convidado : conjutoConvidados) {
            if(convidado.getCodigoConvite() == codigoConvite){
                conjutoConvidados.remove(convidado);
                break;
            }
        }        
    }

    public int contarConvidados(){
        return conjutoConvidados.size();
    }

    public void exibirConvidados(){
        System.out.println(conjutoConvidados);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //adcionar
        conjuntoConvidados.adcionarConvidado("Marcelo", 111);
        conjuntoConvidados.adcionarConvidado("Marcus", 222);
        conjuntoConvidados.adcionarConvidado("Claudio", 333);
        conjuntoConvidados.adcionarConvidado("Jose", 333);
        conjuntoConvidados.adcionarConvidado("Abreu", 444);
        conjuntoConvidados.exibirConvidados();
        
        //remover
        conjuntoConvidados.removerConvidadoPorConvite(333);
        conjuntoConvidados.exibirConvidados();

        //contar
        System.out.println(conjuntoConvidados.contarConvidados());
        


        //exibir
    }
    
}

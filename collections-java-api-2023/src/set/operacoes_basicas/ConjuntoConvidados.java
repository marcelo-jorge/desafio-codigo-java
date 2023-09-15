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

    public void contarConvidados(){
        System.out.println(conjutoConvidados.size());
    }

    public void exibirConvidados(){
        System.out.println(conjutoConvidados);
    }
    
}

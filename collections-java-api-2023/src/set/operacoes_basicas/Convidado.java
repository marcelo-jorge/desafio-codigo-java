package set.operacoes_basicas;

import java.util.Objects;

public class Convidado {
    
    private String nome;
    private int codigoConvite;
    
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return nome + "," + codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }   

        
}

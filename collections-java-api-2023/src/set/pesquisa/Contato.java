package set.pesquisa;

public class Contato {
    
    private String nome;
    private int numero;
    private int telefone;
   
    public Contato(String nome, int numero, int telefone) {
        this.nome = nome;
        this.numero = numero;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Contato [" + nome +","+ numero + "," + telefone + "]";
    }

    
    
    

    
}

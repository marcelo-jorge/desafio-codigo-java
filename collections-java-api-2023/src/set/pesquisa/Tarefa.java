package set.pesquisa;

public class Tarefa {
    private String descricao;
    private boolean concluido;
    
    public Tarefa(String descricao, boolean concluido) {
        this.descricao = descricao;
        this.concluido = concluido;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluido() {
        return concluido;
    }

    @Override
    public String toString() {
        return "Tarefa = " + descricao + ", concluido= " + concluido;
    }

    

    
}

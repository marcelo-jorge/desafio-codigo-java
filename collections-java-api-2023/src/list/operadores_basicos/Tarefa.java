package list.operadores_basicos;

public class Tarefa {
    
    // atributo descricao
    private String descricao;

    //construtor da classe ja substitui o set
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    // obter o atributo descricao
    public String getDescricao(){
        return descricao;
    }

    //para ser usado na impressão da classe
    @Override
    public String toString(){
        return descricao;
    }
    
}

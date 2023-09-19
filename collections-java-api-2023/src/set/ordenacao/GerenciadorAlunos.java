package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        alunoSet = new HashSet<>();
    }

    //adicionarAluno
    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, 0, media));
    }

    //remove aluno
    public void removerAluno(long matricula){
        if(!alunoSet.isEmpty()){
            for (Aluno aluno : alunoSet) {
               if(aluno.getMatricula() == matricula){
                    alunoSet.remove(aluno);
                    System.out.println("Removido aluno: " + aluno);
                    break;
                }
            }
        }else{
            System.out.println("Conjunto vazio");
        }
    }

    // exibir aluno por nome
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()){
            return alunosPorNome;
        }else{
            System.out.println("Conjunto vazio");
            return alunosPorNome;
        }
    }


    // exibir aluno por nota
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if(!alunoSet.isEmpty()){
            return alunosPorNota;
        }else{            
            System.out.println("Conjunto Vazio");
            return alunosPorNota;
        }
    }


    //exibir aluno
    public void exibirAlunos(){
        System.out.println(alunoSet);
    }
    
}

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
        alunoSet.add(new Aluno(nome, matricula, media));
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
            alunosPorNota.addAll(alunoSet);
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

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
    
        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana",123459L, 6.8);
    
        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunoSet);
    
        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000l);
        gerenciadorAlunos.removerAluno(123457l);
        System.out.println(gerenciadorAlunos.alunoSet);
    
        // Exibindo alunos ordenados por nome
        System.out.println("alunos ordenados por nome:");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        
    
        // Exibindo alunos ordenados por nota
        System.out.println("alunos ordenados por nota:");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        
      }
    
}

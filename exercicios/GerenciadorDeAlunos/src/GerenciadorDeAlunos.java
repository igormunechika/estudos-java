/*
Lista de Alunos
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos.
Cada aluno terá atributos como nome, matrícula e nota.

Implementaremos os seguintes métodos:
adicionarAluno(String nome, Long matricula, double media): Adiciona um aluno ao conjunto.
removerAluno(long matricula): Remove um aluno ao conjunto a partir da matricula, se estiver presente.
exibirAlunosPorNome(): Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
exibirAlunosPorNota(): Exibe todos os alunos do conjunto em ordem crescente de nota.
exibirAlunos(): Exibe todos os alunos do conjunto.
 */


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorDeAlunos {
    private Set<Aluno> alunos;

    public GerenciadorDeAlunos(){
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long mat, double med){
        alunos.add(new Aluno(nome, mat, med));
    }

    public void removerAlunoPorMatricula(long mat){
        Aluno alunoParaRemover = null;
        if (!alunos.isEmpty()){
            for (Aluno a : alunos){
                if (a.getMatricula() == mat){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunos.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("Conjunto vazio");
        }
        if (alunoParaRemover == null){
            System.out.println("Matricula não encontrada");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>();
        if (!alunos.isEmpty()) {
            System.out.println(alunosPorNome);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunos.isEmpty()) {
            alunosPorNota.addAll(alunos);
            System.out.println(alunosPorNota);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorDeAlunos gerenciadorAlunos = new GerenciadorDeAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunos);

        gerenciadorAlunos.removerAlunoPorMatricula(000L);
        gerenciadorAlunos.removerAlunoPorMatricula(123457L);
        System.out.println(gerenciadorAlunos.alunos);

        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.exibirAlunosPorNota();
    }
}

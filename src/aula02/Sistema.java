package aula02;

import java.lang.reflect.Array;
import java.util.*;

public class Sistema {
    public static void main(String[] args) {
        Turma<AlunoJava> turmaJava = new Turma<>();
        Turma<AlunoJS> turmaJS = new Turma<>();

        AlunoJava alunoJava1 = new AlunoJava("Jackson");
        AlunoJava alunoJava2 = new AlunoJava("Maria");
        AlunoJava alunoJava3 = new AlunoJava("José");
        cadastrarProfessor(new Professor("Kadu"),turmaJava);
        cadastrarAluno(alunoJava1,turmaJava);
        cadastrarAluno(alunoJava2,turmaJava);
        cadastrarAluno(alunoJava3,turmaJava);

        AlunoJS alunoJS1 = new AlunoJS("Aline");
        AlunoJS alunoJS2 = new AlunoJS("Matheus");
        AlunoJS alunoJS3 = new AlunoJS("Alan");
        cadastrarProfessor(new Professor("Gabriela"),turmaJS);
        cadastrarAluno(alunoJS1,turmaJS);
        cadastrarAluno(alunoJS2,turmaJS);
        cadastrarAluno(alunoJS3,turmaJS);



        System.out.println("Turma Java");
        System.out.printf("Professor: %s\n",turmaJava.getProfessor().getNome());
        for (Aluno aluno : turmaJava.getAlunos()) {
            System.out.println("Aluno: " + aluno.getNome());
        }

        System.out.println("Turma JS");
        System.out.printf("Professor: %s\n",turmaJS.getProfessor().getNome());
        for (Aluno aluno : turmaJS.getAlunos()) {
            System.out.println("Aluno: " + aluno.getNome());
        }

        Collections.sort(turmaJava.getAlunos());
        Collections.sort(turmaJS.getAlunos());
        System.out.println(turmaJava.getAlunos());
        System.out.println(turmaJS.getAlunos());
    }

    public static <T extends Aluno> void cadastrarAluno(T aluno, Turma<T> turma){
        turma.getAlunos().add(aluno);
    }

    public static void cadastrarProfessor(Professor professor, Turma turma) {
        turma.setProfessor(professor);
    }
}

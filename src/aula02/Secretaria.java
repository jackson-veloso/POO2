package aula02;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Secretaria {

    public Turma createTurmaJava(){
        Turma<AlunoJava> turma = new Turma<>();
        return turma;
    }

    public Turma createTurmaJS(){
        Turma<AlunoJS> turma = new Turma<>();
        return turma;
    }



    public void matricula(Professor professor, Turma turma){
        turma.setProfessor(professor);
    }

    public  <T extends Aluno> void matricula(T aluno, Turma<T> turma){
        turma.getAlunos().add(aluno);
    }

    public String getAlunoInfo(Aluno aluno){
        StringBuilder dadosAluno = new StringBuilder();
        dadosAluno.append("Nome: ").append(aluno.getNome())
                .append(", Matricula: ").append(aluno.getMatricula());
        return dadosAluno.toString();
    }

    public <T extends Aluno> List<String> listarAlunos(Turma<T> turma){
        List<String> alunos = new ArrayList<>();
        Collections.sort(turma.getAlunos());
        for (Aluno aluno : turma.getAlunos()) {
            alunos.add(getAlunoInfo(aluno));
        }

        return alunos;
    }

    public <T extends Aluno> List<String> listarAlunosPorMatricula(Turma<T> turma){
        MatriculaComparator comparator = new MatriculaComparator();
        List<String> alunos = new ArrayList<>();
        Collections.sort(turma.getAlunos(),comparator);
        for (Aluno aluno : turma.getAlunos()) {
            alunos.add(getAlunoInfo(aluno));
        }

        return alunos;
    }






}

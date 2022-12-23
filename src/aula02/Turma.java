package aula02;

import java.util.ArrayList;
import java.util.List;

public class Turma<T extends Aluno> {
    private List<T> alunos = new ArrayList<>();
    private Professor professor;

    public List<T> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<T> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}

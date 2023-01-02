package aula02;

import java.util.Comparator;

public class Aluno extends Pessoa implements Comparator<Aluno> {
    private String matricula;
    public Aluno(String nome, String matricula) {

        super.setNome(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Aluno{" +
                "nome='" + super.getNome() + '\'' +
                '}';
    }

    @Override
    public int compare(Aluno o1, Aluno o2) {
        return o1.getMatricula().compareTo(o2.getMatricula());
    }

//    @Override
//    public int compareTo(Pessoa o) {
//
//        return this.nome.compareTo(o.getNome());
//    }



}

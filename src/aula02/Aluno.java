package aula02;

import java.util.Comparator;

public class Aluno extends Pessoa {
    private String matricula;
    private int frequencia;
    public Aluno(String nome, String matricula) {

        super.setNome(nome);
        this.matricula = matricula;
        frequencia=0;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome=" + super.getNome() +
                ", matricula=" + matricula +
                ", frequencia=" + frequencia +
                '}';
    }
}

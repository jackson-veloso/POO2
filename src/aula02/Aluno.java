package aula02;

public class Aluno extends Pessoa {
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
}

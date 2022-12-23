package aula02;

public class Aluno extends Pessoa {
    public Aluno(String nome) {
        super.setNome(nome);
    }


    public String toString() {
        return "Aluno{" +
                "nome='" + super.getNome() + '\'' +
                '}';
    }
}

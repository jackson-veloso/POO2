package aula02;

import java.util.List;

public class Supervisao {
    public void analisaFrequencia(Turma turma){
        Secretaria secretaria = new Secretaria();
        List<String> turmaOrdenada = secretaria.listarAlunos(turma);

        for (String aluno: turmaOrdenada) {
            System.out.println(aluno);
        }
    }
}

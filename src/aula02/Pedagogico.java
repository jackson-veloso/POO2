package aula02;

import java.util.List;

public class Pedagogico {
    public void analisaEvolucaoAcademica(Turma turma){
        Secretaria secretaria = new Secretaria();
        List<String> turmaOrdenada = secretaria.listarAlunosPorMatricula(turma);

        for (String aluno: turmaOrdenada) {
            System.out.println(aluno);
        }
    }
}

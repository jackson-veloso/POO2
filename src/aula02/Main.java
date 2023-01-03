package aula02;

public class Main {
    public static void main(String[] args) {
        Secretaria secretaria = new Secretaria();

        Turma turmaJava = secretaria.createTurmaJava();
        Turma turmaJS = secretaria.createTurmaJS();

        AlunoJava alunoJava1 = new AlunoJava("Jackson","1230");
        AlunoJava alunoJava2 = new AlunoJava("Maria","1231");
        AlunoJava alunoJava3 = new AlunoJava("José","1232");
        secretaria.matricula(new Professor("Kadu"),turmaJava);
        secretaria.matricula(alunoJava1,turmaJava);
        secretaria.matricula(alunoJava2,turmaJava);
        secretaria.matricula(alunoJava3,turmaJava);

        AlunoJS alunoJS1 = new AlunoJS("Aline","1233");
        AlunoJS alunoJS2 = new AlunoJS("Matheus","1234");
        AlunoJS alunoJS3 = new AlunoJS("Alan","1235");
        secretaria.matricula(new Professor("Gabriela"),turmaJS);
        secretaria.matricula(alunoJS1,turmaJS);
        secretaria.matricula(alunoJS2,turmaJS);
        secretaria.matricula(alunoJS3,turmaJS);

        //System.out.println(secretaria.listarAlunos(turmaJava));
        //System.out.println(secretaria.listarAlunosPorMatricula(turmaJS));

        Supervisao supervisao = new Supervisao();
        supervisao.analisaFrequencia(turmaJava);

        Pedagogico pedagogico = new Pedagogico();
        pedagogico.analisaEvolucaoAcademica(turmaJS);




    }
}

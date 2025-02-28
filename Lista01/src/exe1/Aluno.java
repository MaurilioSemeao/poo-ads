package exe1;

public class Aluno {
    public int numeroAluno, idadeAluno; // itpo primitivo
    public float p1, p2; // tipo tpeimitivo
    public String nome; // tipo de uma classe

    public Aluno(){
        this.nome = "Maurilio";
    }

    public Aluno(int numeroAluno, int idadeAluno, String nome, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.idadeAluno = idadeAluno;
        this.p1 = p1;
        this.p2 = p2;
        this.nome = nome;
    }

    public void dadosAluno(){
        System.out.println("numero Aluno: " + this.numeroAluno +
                "\nidade Aluno: " + this.idadeAluno +
                "\nNome do Aluno: " + this.nome +
                "\nNota 1: " + this.p1 +
                "\nNota 2: " + this.p2 +
                "\nSituação: " + this.passou());
    }

    public float notaFinal(){
        return (this.p1 + this.p2)/2;
    }

    public String passou(){
        //operador ternario
        return (this.notaFinal() >= 6) ? "passou" : "Não passou";
    }

}

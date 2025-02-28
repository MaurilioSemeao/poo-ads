import exe1.Aluno;

public class MainAluno {

    public static void main(String[] args){
        //intanciar uma classe -> objeto
        Aluno obj1 = new Aluno(); // chama construtor
        obj1.dadosAluno();
        System.out.println(obj1.notaFinal());

        Aluno obj2 = new Aluno(123, 35, "maurilio", 7.3f, 8.5f);
        obj2.dadosAluno();
        System.out.println(obj2.notaFinal());
    }

}

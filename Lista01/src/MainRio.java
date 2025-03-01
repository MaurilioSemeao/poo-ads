import exe4.Rio;

public class MainRio {

    public static void main(String[] args){
        Rio obj1 = new Rio();
        obj1.chover(5.5f);
        obj1.sujar();
        obj1.mostrar();


        Rio obj2 = new Rio("São Francisco", 2.3f, false);
        obj2.chover(5.5f);
        obj2.sujar();
        obj2.ensolarar(3);
        obj2.limpar();
        obj2.mostrar();
    }

}

package exe4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public void print(String msg) {
        System.out.println(msg);
    }

    public Rio(){
        this.nome = "Sem nome";
    }

    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }
    public void chover(float x){
        float nivelAnterior = this.nivel;
        this.nivel += x;
        print("O nivel do rio aumentou de " + nivelAnterior + " para " + this.nivel);
    }

    public void ensolarar(float x){
        float nivelAnterior = this.nivel;
        this.nivel -= x;
        print("O nivel do rio diminuiu de "  + nivelAnterior + " para " + this.nivel);
    }

    public void limpar(){
        this.poluido = false;
        print("O Rio foi limpado");
    }

    public void sujar(){
        this.poluido = true;
        print("O Rio foi sujado");
    }

    public void mostrar(){
        print("Nome do Rio: " + this.nome +
                "\nNivel do Rio: " + this.nivel +
                "\nRio poluido: " + (this.poluido ? "Sim" : "Não"));
    }


}

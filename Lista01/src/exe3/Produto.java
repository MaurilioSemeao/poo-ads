package exe3;

public class Produto {
    public int id, qtde;
    public String descricao;
    public double preco;

    public Produto() {
        this.descricao = "sem descricao";
    }

    public void print(String msg) {
        System.out.println(msg);
    }

    public Produto(int id, String descricao, int qtde, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }
    public void comprar(int x){
        this.qtde += x;
        this.print("Produto comprado com sucesso");
    }

    public void subir(float x){
        this.preco += x;
        this.print("Preço do produto Subiu");
    }

    public void vender(int x){
        if(this.qtde >= x){
            this.qtde -= x;
            this.print("Venda Realizada com sucesso!");

        }else{
            this.print("Impossivel Realizar a venda");
        }
    }

    public void decer(float x){
        if(this.preco >= x){
            this.preco -= x;
            this.print("Preço diminuiu com sucesso!");
        }else{
            this.print("Impossivel diminuir o preço");
        }
    }

    public void mostra(){
        this.print("Id " + this.id + " Descrição " + this.descricao +
                "Qtde " + this.qtde + " Preço " + this.preco);
    }
}

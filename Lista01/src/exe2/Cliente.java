package exe2;

public class Cliente {
    public int nroAgencia, nroConta;
    public String nome;
    public float saldo;

    // metodo construtor sem parametro
    public Cliente(){
        this.nome = "Sem nome";
    }

    public Cliente(int nroAgencia, int nroConta, String nome, float saldo) {
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(float valor){
        this.saldo += valor;
        System.out.println(" Depísito de " + valor + " realizado com sucesso.\n Seu novo Saldo é de R$ " + this.saldo);

    }

    //fazer saque
    public void sacar(float valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome +
                "\nAgencia: " + this.nroAgencia +
                "\nConta " + this.nroConta +
                "\nSaldo: " + this.saldo );
    }

}

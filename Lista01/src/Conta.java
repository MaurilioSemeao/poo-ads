public class Conta {
    public int numeroConta;
    public double saldoConta;
    public String titular, tipoConta;

    public Conta(int numeroConta, float saldoConta, String titular, String tipoConta) {
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
        this.titular = titular == null ? "nao informado" : titular;
        this.tipoConta = tipoConta == null ? " nao informado" : tipoConta;
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + this.titular +
                "\nSaldo: " + this.saldoConta +
                "\nTipo: " + this.tipoConta +
                "\nConta: " + this.numeroConta);
    }

}

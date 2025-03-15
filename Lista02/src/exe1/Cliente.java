package exe1;

public class Cliente {
    private String numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private float saldoConta;

    public Cliente() {
        this.numeroConta = "Numero Da Conta não Informado";
        this.numeroAgencia = "Numero Da Agencia não Informado";
        this.nomeCliente = "Nome Do Cliente não Informado";
    }

    public Cliente( String numeroConta, String numeroAgencia, String nomeCliente, float saldoConta){
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNomeCliente(nomeCliente);
        this.setSaldoConta(saldoConta);
    }

    //getters
    public String getNumeroConta() {
        return this.numeroConta;
    }
    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public float getSaldoConta(){
        return this.saldoConta;
    }

    //setters
    public void setNumeroConta(String nroConta){
        if(!this.validaNumero(nroConta, 8)){
            print("Numero Da Conta Invalido");
        }
    }

    public void setNumeroAgencia(String nroAgencia){
        if(!this.validaNumero(nroAgencia, 6)){
            print("Numero Da Agencia Invalido");
        }
    }
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }

    public void setSaldoConta(float valorDeposito){
        this.validaDeposito(valorDeposito);
    }

    private boolean verificaSaldoConta(float saldo){
        return this.saldoConta < saldo;
    }

    private boolean validaNumero(String nroConta, int tamanho){
        if(nroConta.length() == tamanho && nroConta.charAt(tamanho-2) == '-' ){
            return true;
        }
        return false;
    }

    private void validaDeposito(float valorDeposito){
        if(valorDeposito < 0){
            print("O Saldo nao pode ser negativo! ");
        }else{
            this.saldoConta += valorDeposito;
            print("Deposito Efetuado com sucesso! \nSeu novo Saldo é de: R$"+this.saldoConta);
        }
    }

    public float realizarSaque(float valorSaque){
        if(verificaSaldoConta(valorSaque)){
           print("Saldo Insuficiente");
            return 0.0f;
        }
        this.saldoConta -= valorSaque;
        print("Saque realizado com sucesso!");
        print("Saldo atual: R$"+this.saldoConta);
        return valorSaque;
    }

    public void realizarDeposito(float valorDeposito){
        this.setSaldoConta(valorDeposito);
        print("Deposito realizado com sucesso!");
        print("Saldo atual: R$"+this.saldoConta);
    }



    private void print(String msg){
        System.out.println(msg);
    }

}

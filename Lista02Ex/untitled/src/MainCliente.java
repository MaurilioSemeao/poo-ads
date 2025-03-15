import exe0.Cliente;

public class MainCliente {
    public static void main(String[] args) {

        Cliente obj1 = new Cliente();
        obj1.setNumeroConta("123456-7");
        obj1.setNumeroAgencia("1234-5");
        obj1.setNome("Maurilio Santos Semeão");
        obj1.setSaldo(0);
        System.out.println("Nro Conta: " + obj1.getNumeroConta());



    }
}
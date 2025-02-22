public class Pessoa {
    public String nome, cpf, genero;
    public int idade;
    public float peso;
    public float altura;

    public Pessoa(String nome, String cpf, String genero, int idade, float peso, float altura){
        this.nome = nome;
        this.cpf = cpf;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
    }

    public float getIMC(){
       return this.peso / (this.altura * this.altura);
    }

    public void detalhes(){
        System.out.println(
                "Nome: " + this.nome +
                "CPF: " + this.cpf +
                "Genero: " + this.genero +
                "Idade: " + this.idade +
                "Peso: " + this.peso +
                "Altura: " + this.altura +
                "IMC: " + this.getIMC()
        );
    }
}

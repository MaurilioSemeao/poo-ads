package exe0;
public class Carro {

    //modificador de acessi private - variáveis são encapsuladas
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Carro(){
        this.marca = "sem marca";
        this.modelo = "sem modelo";
    }

    public Carro(String marca, String modelo, int ano, float velocidade){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    //getters
    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public float getVelocidade(){
        return this.velocidade;
    }



    //setters
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setAno(int ano){
        if (ano >= 0){
            this.ano = ano;
        }
        else {
            System.out.println("Ano não pode ser/ficar negativo");
        }
    }

    public void setVelocidade(float velocidade){
        // isso é encapsular
        if (velocidade >= 0){
            this.velocidade = velocidade;
        }
        else {
            System.out.println("Velocidade não pode ser/ficar negativa");
        }
    }

    public void acelerar(float x){
        this.setVelocidade(this.velocidade + x);
        this.verificaLimiteVelocidade();
    }

    public void frear(float x){
        this.setVelocidade(this.velocidade - x);
        this.verificaLimiteVelocidade();
    }

    private void verificaLimiteVelocidade(){
        if(this.velocidade >= 200){
            this.velocidade = 200;
            System.out.println("Velocidade nao pode ultrapassar 200");
        }
        if(this.velocidade <= 0){
            this.velocidade = 0;
            System.out.println("Velocidade nao pode ser negativa");
        }
    }


    public String exibeDados(){
        return "Marca : " + this.marca +
                "\nModelo : " + this.modelo +
                "\nAno : " + this.ano +
                "\nVelocidade : " + this.velocidade;
    }
}

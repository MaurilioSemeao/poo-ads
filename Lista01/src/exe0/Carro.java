package exe0;

import javax.swing.*;

public class Carro {
    //variaveis
    //cujo tipo de dados são primitivos
    public int ano;
    public float velocidade;

    //cujo tipos de dados são classes
    public String marca, modelo;

    //metodo construtor
    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //para nao aparecer null quando a função for chamada por um obj não declarado
    public Carro(){
        this.marca = "Não defindo";
        this.modelo = "Não definido";
    }
    //metodos / função
    public void exibirDetalhes(){
        JOptionPane.showMessageDialog(null,"Marca: " + marca +
                "\nModelo: " + modelo +
                "\nAno: " + ano +
                "\nVelocidade: " + velocidade);
    }

    //acelerar o carro de x unidades
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }
    //frear o carro em x unidades
    //velocidade não pode ficar negativa após frear
    public void frear(float x){
        if (this.velocidade >= x) {
            this.velocidade = this.velocidade -= x;
        }
        else{
            JOptionPane.showMessageDialog(null,"Velocidade não pode ser negativa");
}
}
}
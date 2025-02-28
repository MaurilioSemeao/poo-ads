

import exe0.Carro;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainCarro {
    public static void main(String[] args) {
        //criação dos objetos da classe carro
        //dando valor separadamente para as variaveis
        Carro obj1 = new Carro();
        obj1.ano = 2000;
        obj1.velocidade = 0;
        obj1.marca = "Volkswagem";
        obj1.modelo = "Fusca";
        obj1.exibirDetalhes();//quem chama a função é o objeto
        obj1.acelerar(100);
        obj1.exibirDetalhes();//exibindo acelerar

        Carro obj2 = new Carro(2012, 30, "Chevrolet", "Corsa"); //metodo construtor
        obj2.exibirDetalhes();
        obj2.acelerar(30);
        obj2.exibirDetalhes();
        obj2.frear(30);
        obj2.exibirDetalhes();//exibindo frear


        Carro obj3 = new Carro();
        obj3.exibirDetalhes();//exibindo obj sem valor para as variaveis

        Carro obj4 = new Carro();
        obj4.ano =  Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
        obj4.velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o velocidade: "));
        obj4.marca = JOptionPane.showInputDialog("Digite o marca: ");
        obj4.modelo = JOptionPane.showInputDialog("Digite o modelo: ");
        obj4.exibirDetalhes();
        obj4.acelerar(50);
        obj4.frear(10);
        obj4.exibirDetalhes();


        }
}
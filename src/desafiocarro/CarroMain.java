package desafiocarro;

import desafiocarro.CarroClass;

import javax.swing.*;
import java.util.Scanner;

public class CarroMain {

    public static void main(String[] args) {

        CarroClass c1 = new CarroClass();
        System.out.println("Adicione um carro a sua garagem: ");
        c1.marca = JOptionPane.showInputDialog("Diga a marca do seu carro");
        c1.modelo = JOptionPane.showInputDialog("Diga o modelo");
        c1.ano = Integer.parseInt(JOptionPane.showInputDialog("Diga o ano:"));
        c1.combustivel = Double.parseDouble(JOptionPane.showInputDialog("Quanto litros de combustivel tem no carro"));
        c1.KmInicial = Double.parseDouble(JOptionPane.showInputDialog("Quantos km rodados?"));

        System.out.println(c1.detalhes());
        Scanner entrada = new Scanner(System.in);
        int quantcarro = 0;
        //boolean teste = true;
        while (quantcarro != -1) {
            System.out.println("Deseja adcionar outro carro? (informe -1 se quiser sair)");
            quantcarro = entrada.nextInt();
            if (quantcarro != -1) {
                CarroClass c2 = new CarroClass();
                System.out.println("Adicione um carro a sua garagem: ");
                c2.marca = JOptionPane.showInputDialog("Diga a marca do seu carro");
                c2.modelo = JOptionPane.showInputDialog("Diga o modelo");
                c2.ano = Integer.parseInt(JOptionPane.showInputDialog("Diga o ano:"));
                c2.combustivel = Double.parseDouble(JOptionPane.showInputDialog("Quanto litros de combustivel tem no carro"));
                c2.KmInicial = Double.parseDouble(JOptionPane.showInputDialog("Quantos km rodados?"));
                System.out.println(c2.detalhes());

            } else {
                System.out.println("Tenha um bom dia com seus carros");


            }


        }


    }
}




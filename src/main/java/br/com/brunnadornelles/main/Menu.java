package br.com.brunnadornelles.main;

import br.com.brunnadornelles.model.CappucinoVegano;
import br.com.brunnadornelles.model.ChocolateQuenteMexicano;
import br.com.brunnadornelles.model.DalgonaCoffe;

import javax.swing.*;

public class Menu {

    public static void main(String[] args) {
        boolean sair = true;

        while (sair){
            String escolha = JOptionPane.showInputDialog("Bem-vindo\n" +
                    "Escolha uma das seguintes opções:\n" +
                    "1 - Chocolate Quente Mexicano\n" +
                    "2 - Dalgona Coffe\n" +
                    "3 - Cappucino Vegano\n" +
                    "4 - Sair");

            int opcao = Integer.parseInt(escolha);

            switch (opcao){
                case 1:
                    ChocolateQuenteMexicano chocolateQuenteMexicano = new ChocolateQuenteMexicano();
                    chocolateQuenteMexicano.iniciarChocolateQuenteMexicano();
                    break;

                case 2:
                    DalgonaCoffe dalgonaCoffe = new DalgonaCoffe();
                    dalgonaCoffe.iniciarDalgonaCoffe();

                    break;

                case 3:
                    CappucinoVegano cappucinoVegano = new CappucinoVegano();
                    cappucinoVegano.iniciarCappucinoVegano();
                    break;

                case 4:
                    sair = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!" +
                            " Favor tente novamente");




            }
        }

    }
}

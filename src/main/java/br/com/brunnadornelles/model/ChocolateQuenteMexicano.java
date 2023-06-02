package br.com.brunnadornelles.model;

import br.com.brunnadornelles.templates.BebidaAquecida;

public class ChocolateQuenteMexicano extends BebidaAquecida {

    public ChocolateQuenteMexicano() {
    }

    public void iniciarChocolateQuenteMexicano() {
        System.out.println(pedidoRecebido());
        System.out.println(addIngredientes());
        System.out.println(aquecendoBebida());
        System.out.println(pedidoFinalizado());
        System.out.println(" ------------------------------------------------------------------ ");
    }

    @Override
    public String pedidoRecebido() {
        String mensagem = "1 - Iniciando o preparo de seu Chocolate Quente Mexicano.\n";
        return mensagem;

    }

    @Override
    public String addIngredientes() {
        String mensagem = "2 - Adicionando todos os ingredientes necessários.\n";
             return mensagem;
    }


    @Override
    public String aquecendoBebida() {
        String mensagem = "3 - Aquecendo por 30 segundos\n";
       return mensagem;

    }

    @Override
    public String pedidoFinalizado() {
        String mensagem = "4 - Hmmm...bebida pronta. Favor, retire o seu copo!\n";
        return mensagem;
    }

 }

package br.com.brunnadornelles.templates;

public abstract class BebidaAquecida {

    public abstract String pedidoRecebido();
    public abstract String addIngredientes();
    public abstract String aquecendoBebida();
    public abstract String pedidoFinalizado();

    public void prepararBebida() {
        pedidoRecebido();
        addIngredientes();
        aquecendoBebida();
        pedidoFinalizado();
    }
}

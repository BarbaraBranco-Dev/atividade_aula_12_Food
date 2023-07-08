package model;

public class Venda {

    private int quantidadeVendas;
    private double valorVendido;
    private Food food;

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }
    public double getValorVendido() {
        return valorVendido;
    }
    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }
    public Food getFood() {
        return food;
    }
    public void setFood(Food food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return String.format("Food[%D - %2.f]", getQuantidadeVendas(),getValorVendido());
    }
    
}

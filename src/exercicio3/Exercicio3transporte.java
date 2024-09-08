package exercicio3;

abstract class Transporte {
    protected int capacidade;
    protected int velocidadeMaxima;

    public Transporte(int capacidade, int velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public abstract void mover();
    public abstract void parar();
}

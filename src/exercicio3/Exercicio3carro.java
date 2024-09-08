package exercicio3;

class Carro extends Transporte implements Combustivel {
    public Carro(int capacidade, int velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public void mover() {}

    @Override
    public void parar() {}

    @Override
    public void abastecer() {}
}

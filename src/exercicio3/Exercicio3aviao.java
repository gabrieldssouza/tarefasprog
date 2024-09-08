package exercicio3;

class Aviao extends Transporte implements Combustivel {
    public Aviao(int capacidade, int velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public void mover() {}

    @Override
    public void parar() {}

    @Override
    public void abastecer() {}
}

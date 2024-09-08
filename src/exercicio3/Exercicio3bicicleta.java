package exercicio3;

class Bicicleta extends Transporte {
    public Bicicleta(int capacidade, int velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public void mover() {}

    @Override
    public void parar() {}
}

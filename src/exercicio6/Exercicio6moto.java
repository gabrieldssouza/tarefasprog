package exercicio6;

class Moto extends Veiculo implements Manutencao {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {}

    @Override
    public void desligar() {}

    @Override
    public void acelerar() {}

    @Override
    public void realizarManutencao() {}
}

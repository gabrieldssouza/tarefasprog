package exercicio6;

class Caminhao extends Veiculo implements Manutencao {
    public Caminhao(String marca, String modelo, int ano) {
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

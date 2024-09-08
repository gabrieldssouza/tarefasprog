package exercicio5;

class Reptil extends Animal {
    public Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {}

    @Override
    public void alimentar() {}
}

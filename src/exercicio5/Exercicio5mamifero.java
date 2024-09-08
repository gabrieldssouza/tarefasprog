package exercicio5;

class Mamifero extends Animal {
    public Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {}

    @Override
    public void alimentar() {}
}

package exercicio5;

abstract class Animal {
    protected String nome;
    protected int idade;
    protected String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public abstract void emitirSom();
    public abstract void alimentar();
}

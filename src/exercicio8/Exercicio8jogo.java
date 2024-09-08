package exercicio8;

abstract class Jogo {
    protected String titulo;
    protected String genero;
    protected int classificacaoEtaria;

    public Jogo(String titulo, String genero, int classificacaoEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public abstract void iniciar();
    public abstract void pausar();
    public abstract void finalizar();
}
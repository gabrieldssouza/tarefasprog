package exercicio2;

class Livro extends Publicacao {
    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {}

    @Override
    public void devolver() {}
}

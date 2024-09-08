package exercicio2;

class Jornal extends Publicacao {
    public Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {}

    @Override
    public void devolver() {}
}
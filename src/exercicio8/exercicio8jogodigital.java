package exercicio8;

class JogoDigital extends Jogo implements Multiplayer {
    public JogoDigital(String titulo, String genero, int classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {}

    @Override
    public void pausar() {}

    @Override
    public void finalizar() {}

    @Override
    public void conectarJogadores() {}
}
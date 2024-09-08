package exercicio7;

class ProdutoServico extends Produto implements Promocao {
    public ProdutoServico(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularPrecoFinal() {
        return 0;
    }

    @Override
    public void exibirDetalhes() {}

    @Override
    public void aplicarPromocao() {}
}

package exercicio7;

class ProdutoDigital extends Produto implements Promocao {
    public ProdutoDigital(String nome, double preco, String categoria) {
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

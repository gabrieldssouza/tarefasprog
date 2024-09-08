package exercicio4;

class PedidoComum extends Pedido {
    public PedidoComum(int numeroPedido) {
        super(numeroPedido);
    }

    @Override
    public double calcularTotal() {
        return 0;
    }

    @Override
    public void adicionarItem(String item) {}

    @Override
    public void removerItem(String item) {}
}

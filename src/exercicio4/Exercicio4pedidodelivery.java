package exercicio4;

class PedidoDelivery extends Pedido {
    public PedidoDelivery(int numeroPedido) {
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

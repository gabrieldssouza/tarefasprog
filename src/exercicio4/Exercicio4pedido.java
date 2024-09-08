package exercicio4;

abstract class Pedido {
    protected int numeroPedido;
    protected List<String> itens;
    protected String status;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.itens = new ArrayList<>();
        this.status = "Aberto";
    }

    public abstract double calcularTotal();
    public abstract void adicionarItem(String item);
    public abstract void removerItem(String item);
}

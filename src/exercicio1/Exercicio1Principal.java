package exercicio1;

class FuncionarioHorista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }
}

class FuncionarioComissionado extends Funcionario {
    private double totalVendas;
    private double comissao;

    public FuncionarioComissionado(String nome, double salarioBase, double totalVendas, double comissao) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (totalVendas * comissao);
    }
}

interface Pagamento {
    void processarPagamento();
}

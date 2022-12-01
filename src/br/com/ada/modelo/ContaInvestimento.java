package br.com.ada.modelo;

public abstract class ContaInvestimento extends Conta implements Investimento, Saque{

    private Double taxaRendimento;

    public ContaInvestimento(String numero, Cliente cliente, Double saldo, Double taxaRendimento) {
        super(numero, cliente, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void investir(Double valor) {

        saldo += valor;

    }

    @Override
    public void sacar(Double valor) {

        saldo -= valor;

    }
}

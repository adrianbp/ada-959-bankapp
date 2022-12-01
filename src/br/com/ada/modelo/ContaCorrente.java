package br.com.ada.modelo;

public abstract class ContaCorrente extends  Conta implements  Deposito, Saque, Transferencia{

    private Double taxa;


    public ContaCorrente(String numero, Cliente cliente, Double saldo, Double taxa) {
        super(numero, cliente, saldo);
        this.taxa = taxa;
    }


    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(Double valor) {

        Double valorTaxa = valor * taxa;

        saldo -= valor + valorTaxa;

        System.out.println("Valor Taxa Cobrada: " + valorTaxa);


    }

    @Override
    public void trasnferir(ContaCorrente contaDestino, Double valor) {
            Double valorTaxa = valor * taxa;
            saldo -= valor + valorTaxa;
            contaDestino.depositar(valor);

        System.out.println("Valor Taxa Cobrada: " + valorTaxa);
    }
}

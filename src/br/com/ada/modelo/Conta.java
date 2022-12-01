package br.com.ada.modelo;

public abstract class Conta {

    private String numero;
    private Cliente cliente;
    protected Double saldo;

    public Conta(String numero, Cliente cliente, Double saldo) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }
}

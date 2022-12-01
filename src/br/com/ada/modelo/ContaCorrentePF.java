package br.com.ada.modelo;

public class ContaCorrentePF extends ContaCorrente {


    public ContaCorrentePF(String numero, ClientPf cliente, Double saldo) {
        super(numero, cliente, saldo, 0.0);
    }
}

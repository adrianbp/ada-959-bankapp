package br.com.ada.modelo;

public class ContaCorrentePJ extends ContaCorrente{


    public ContaCorrentePJ(String numero, ClientePj cliente, Double saldo) {
        super(numero, cliente, saldo, 0.5);
    }
}

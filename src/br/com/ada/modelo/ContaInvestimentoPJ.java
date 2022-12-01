package br.com.ada.modelo;

public class ContaInvestimentoPJ extends  ContaInvestimento{


    public ContaInvestimentoPJ(String numero, Cliente cliente, Double saldo, Double taxaRendimento) {
        super(numero, cliente, saldo, taxaRendimento + 2.0);
    }
}

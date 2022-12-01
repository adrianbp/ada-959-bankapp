package br.com.ada.modelo;

public class ContaInvestimentoPF extends  ContaInvestimento{


    public ContaInvestimentoPF(String numero, ClientPf cliente, Double saldo, Double taxaRendimento) {
        super(numero, cliente, saldo, taxaRendimento);
    }
}

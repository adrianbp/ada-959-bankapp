package br.com.ada.modelo;

@FunctionalInterface
public interface Transferencia {

    void trasnferir (ContaCorrente contaDestino, Double valor);
}

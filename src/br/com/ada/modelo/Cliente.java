package br.com.ada.modelo;

import br.com.ada.modelo.Documento;

public abstract class Cliente {

    private String nome;
    private Documento documento;

    public Cliente(String nome, Documento documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public Documento getDocumento() {
        return documento;
    }
}

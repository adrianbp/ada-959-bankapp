package br.com.ada.modelo;

public class Cpf implements Documento{

    private String cpf;

    public Cpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getDocumento() {
        return cpf;
    }
}

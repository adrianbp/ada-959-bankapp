package br.com.ada.modelo;

public class Cnpj implements Documento{

    private String cnpj;

    public Cnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getDocumento() {
        return this.cnpj;
    }
}

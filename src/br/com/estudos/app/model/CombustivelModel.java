package br.com.estudos.app.model;

public class CombustivelModel {

    private String tipo;
    private double precoPorLitro;

    public CombustivelModel(double precoPorLitro, String tipo) {
        this.precoPorLitro = precoPorLitro;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void setPrecoPorLitro(double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }
}

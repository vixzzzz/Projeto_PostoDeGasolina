package br.com.estudos.app.model;

public class CombustivelModel {

    private String tipo;
    private double precoPorLitro;
    private int qtdCombustivel;

    public CombustivelModel(double precoPorLitro, String tipo, int qtdCombustivel) {
        this.precoPorLitro = precoPorLitro;
        this.tipo = tipo;
        this.qtdCombustivel = qtdCombustivel;
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

    public int getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(int qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

}

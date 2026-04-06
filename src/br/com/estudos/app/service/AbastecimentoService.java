package br.com.estudos.app.service;

import br.com.estudos.app.model.CombustivelModel;

import javax.swing.*;

public class AbastecimentoService {

    private double total;

    public double calcularValor(double litros, CombustivelModel combustivelModel) {

        double total = litros * combustivelModel.getPrecoPorLitro();

        return total;
    }

    public double getTotal() {
        return total;
    }

    public void subtrairCombustivel(double litros, CombustivelModel combustivelModel) {
        int qtdAtual = combustivelModel.getQtdCombustivel();
        int novaQtd = (int) (qtdAtual - litros);
        combustivelModel.setQtdCombustivel(novaQtd);
        
    }

    public boolean verificarCombustivel(double litros, CombustivelModel combustivelModel) {
        if (combustivelModel.getQtdCombustivel() <= 0) {
            JOptionPane.showMessageDialog(null, "O combustível está esgotado, por favor escolha outro tipo de combustível.");
            return false;
        } else {
            if (litros > combustivelModel.getQtdCombustivel()) {
                JOptionPane.showMessageDialog(null, "A quantidade solicitada excede o estoque disponível. Por favor, escolha uma quantidade menor.");
                return false;
            } else {
                JOptionPane.showMessageDialog(null, "Combustível disponível para abastecimento.");
                return true;
            }   
        }
    }


}

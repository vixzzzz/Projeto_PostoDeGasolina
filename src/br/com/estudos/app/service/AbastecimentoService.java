package br.com.estudos.app.service;

import br.com.estudos.app.model.CombustivelModel;

import javax.swing.*;

public class AbastecimentoService {

    public double calcularValor(double litros, CombustivelModel combustivelModel) {

        double total = litros * combustivelModel.getPrecoPorLitro();

        return total;
    }
}

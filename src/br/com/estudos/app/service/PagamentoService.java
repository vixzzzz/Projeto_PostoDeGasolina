package br.com.estudos.app.service;

import javax.swing.*;

public class PagamentoService {

    private double valor;
    private String op;

    public double pagar(double valor) {

        AbastecimentoService valortotal = new AbastecimentoService();

        this.valor = valor;


        if (op.equalsIgnoreCase("PIX")) {
            valor *= 0.90;
            JOptionPane.showMessageDialog(null, "Desconto de 10% aplicado no pix!");
        } else if (op.equalsIgnoreCase("DINHEIRO")) {
            valor *= 0.98;
            JOptionPane.showMessageDialog(null, "Desconto de 2% aplicado no Dinheiro");
        } else if (op.equalsIgnoreCase("CARTAO")) {
            JOptionPane.showMessageDialog(null, "O combustivel esta pago!");
        } else {
            JOptionPane.showMessageDialog(null, "Metodo invalido!");
        }
        return valor;
    }

    public void opcoesDeP(String op) {
        this.op = op;
    }
}


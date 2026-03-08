package br.com.estudos.app.service;

import javax.swing.*;

public class PagamentoService {

    private double valor;
    private String op;

    public double mostrarValor(double valor) {

        this.valor = valor;

        if (op.equalsIgnoreCase("PIX")) {
            valor *= 0.90;
            JOptionPane.showMessageDialog(null, "Desconto de 10% aplicado no pix! \n " +
                    "O valor com desconto : " + valor + " !");
        } else if (op.equalsIgnoreCase("DINHEIRO")) {
            valor *= 0.98;
            JOptionPane.showMessageDialog(null, "Desconto de 2% aplicado no Dinheiro! \n " +
                    "O valor com desconto : " + valor + " !");
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


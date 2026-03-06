package br.com.estudos.app;

import br.com.estudos.app.model.CombustivelModel;
import br.com.estudos.app.service.AbastecimentoService;
import br.com.estudos.app.service.PagamentoService;

import javax.swing.JOptionPane;

public class MainAplication {

    public static void main (String[] args) {

        AbastecimentoService carro1 = new AbastecimentoService();

        PagamentoService pagar = new PagamentoService();

        CombustivelModel regrasDoPostoGasolina = new CombustivelModel(5.0, "Comum");

        CombustivelModel regrasDoPostoEtanol = new CombustivelModel(6.0, "Etanol");

        String pergunta = JOptionPane.showInputDialog("Digite a quantidade de combustivel em litros");

        double gas = Double.parseDouble(pergunta);

        String tipoCombustivel = JOptionPane.showInputDialog("Qual tipo do combustivel?");

        double resultadogasolina = carro1.calcularValor(gas,regrasDoPostoGasolina);
        double resultadoetanol = carro1.calcularValor(gas,regrasDoPostoEtanol);

        if (tipoCombustivel.equalsIgnoreCase("Gasolina")) {
            JOptionPane.showMessageDialog(null, "O Valor foi de : "  + resultadogasolina + " Reais! ");
        } else if (tipoCombustivel.equalsIgnoreCase("Etanol")) {
            JOptionPane.showMessageDialog(null, "O Valor foi de : "  + resultadoetanol + " Reais! ");
        } else {
            JOptionPane.showMessageDialog(null, "Não temos esse tipo de combustivel, desculpe!");

        }


        JOptionPane.showMessageDialog(null, "Digite o meio de pagamento");

        String resposta = JOptionPane.showInputDialog("PIX,CARTAO OU DINHEIRO");

        pagar.opcoesDeP(resposta);

        String valorStringpraconverter = JOptionPane.showInputDialog("Digite o valor a ser pago!");

        double valor = Double.parseDouble(valorStringpraconverter);

        pagar.pagar(valor);




    }
}
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
        
        double totalVenda = 0;

        String tipoCombustivel = JOptionPane.showInputDialog("Qual tipo do combustivel?");

        // calculando a valor da goslina e etanol.
        if (tipoCombustivel.equalsIgnoreCase("Gasolina")) {
            double resultadoGasolina = carro1.calcularValor(gas,regrasDoPostoGasolina);
            JOptionPane.showMessageDialog(null, "O Valor foi de : "  + resultadoGasolina + " Reais! ");
            totalVenda = resultadoGasolina;
        } else if (tipoCombustivel.equalsIgnoreCase("Etanol")) {
            double resultadoEtanol = carro1.calcularValor(gas,regrasDoPostoEtanol);
            JOptionPane.showMessageDialog(null, "O Valor foi de : "  + resultadoEtanol + " Reais! ");
            totalVenda = resultadoEtanol;
        } else {
            JOptionPane.showMessageDialog(null, "Não temos esse tipo de combustivel, desculpe!");

        }


        JOptionPane.showMessageDialog(null, "Digite o meio de pagamento");

        String resposta = JOptionPane.showInputDialog("PIX,CARTAO OU DINHEIRO");

        pagar.opcoesDeP(resposta);

        String valorStringpraconverter = JOptionPane.showInputDialog("Digite o valor a ser pago!");

        double valor = Double.parseDouble(valorStringpraconverter);

        // Nao deixa pagar menos ou mais que o preço.

        if (totalVenda > valor) {
            JOptionPane.showMessageDialog(null, "Valor insuficiente!");
        } else if (totalVenda < valor) {
            JOptionPane.showMessageDialog(null, "O valor esta acima do esperado");
        }  else {
            pagar.pagar(valor);

        }


    }
}
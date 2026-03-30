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

        while (true) {

        String pergunta = JOptionPane.showInputDialog("Digite a quantidade de combustivel em litros");


        if (pergunta == null) {
            JOptionPane.showMessageDialog(null, "Ate Logo!");
            break;
        }

        if (pergunta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Quantidade de combustivel é obrigatória!");
            continue; // Volta para o início do loop para solicitar novamente
        }

        double gas = Double.parseDouble(pergunta);
        
        double totalVenda = 0;

        String tipoCombustivel = JOptionPane.showInputDialog("Qual tipo do combustivel?");

        if (tipoCombustivel == null) {
            JOptionPane.showMessageDialog(null, "Ate Logo!");
            break;
        }

        if (tipoCombustivel.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tipo de combustivel é obrigatório!");
            continue; // Volta para o início do loop para solicitar novamente
        }
        // calculando a valor da goslina e etanol.
        if (tipoCombustivel.equalsIgnoreCase("Gasolina")) {
            double resultadoGasolina = carro1.calcularValor(gas,regrasDoPostoGasolina);
            totalVenda = resultadoGasolina;
        } else if (tipoCombustivel.equalsIgnoreCase("Etanol")) {
            double resultadoEtanol = carro1.calcularValor(gas,regrasDoPostoEtanol);
            totalVenda = resultadoEtanol;
        } else {
            JOptionPane.showMessageDialog(null, "Não temos esse tipo de combustivel, desculpe!");

        }


        JOptionPane.showMessageDialog(null, "Digite o meio de pagamento");


        String resposta = JOptionPane.showInputDialog("PIX,CARTAO OU DINHEIRO");

        if (resposta == null) {
            JOptionPane.showMessageDialog(null, "Ate Logo!");
            break;
        }

        if(resposta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Meio de pagamento é obrigatório!");
            continue; // Volta para o início do loop para solicitar novamente
        }

      

        pagar.opcoesDeP(resposta);

        // atualiza o valor com desconto
        totalVenda = pagar.mostrarValor(totalVenda);


        String valorPraconverter = JOptionPane.showInputDialog("Digite o valor a ser pago!");

        if (valorPraconverter == null) {
            JOptionPane.showMessageDialog(null, "Ate Logo!");
            break;
        }

        if (valorPraconverter.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Valor a ser pago é obrigatório!");
            continue; // Volta para o início do loop para solicitar novamente
        }

        double valor = Double.parseDouble(valorPraconverter);
        // Nao deixa pagar menos ou mais que o preço.

        if (totalVenda > valor) {
            JOptionPane.showMessageDialog(null, "Valor insuficiente!");
        } else if (totalVenda < valor) {
            JOptionPane.showMessageDialog(null, "O valor esta acima do esperado");
        } else {
            JOptionPane.showMessageDialog(null,"Combustivel Pago, volte sempre!");
        }

    }

    }
}
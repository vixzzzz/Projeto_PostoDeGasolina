package br.com.estudos.app;

import br.com.estudos.app.model.CombustivelModel;
import br.com.estudos.app.service.AbastecimentoService;
import br.com.estudos.app.service.PagamanetoService;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class MainAplication {

    public static void main (String[] args) {

        AbastecimentoService carro1 = new AbastecimentoService();

        PagamanetoService pagar = new PagamanetoService();

        CombustivelModel regrasDoPostoGasolina = new CombustivelModel(5.0, "Comum");

        CombustivelModel regrasDoPostoEtanol = new CombustivelModel(6.0, "Etanol");

        String pergunta = JOptionPane.showInputDialog("Digite a quantidade de combustivel em litros");

        double gas = Double.parseDouble(pergunta);

        String tipoCombustivel = JOptionPane.showInputDialog("Qual tipo do combustivel?");

        double resultado = carro1.calcularValor(gas,regrasDoPostoGasolina);

        JOptionPane.showMessageDialog(null, "O Valor foi de : "  + resultado + " Reais! ");

        JOptionPane.showMessageDialog(null, "Digite o meio de pagamento");

        String resposta = JOptionPane.showInputDialog("PIX,CARTAO OU DINHEIRO");

        pagar.opcoesDeP(resposta);

        String valorStringpraconverter = JOptionPane.showInputDialog("Digite o valor");

        double valor = Double.parseDouble(valorStringpraconverter);

        pagar.pagar(valor);




    }
}
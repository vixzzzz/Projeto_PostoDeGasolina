⛽ Sistema de Posto de Combustível

Este é um projeto desenvolvido em Java com o objetivo de aplicar conceitos fundamentais de POO e interação com o usuário através da biblioteca javax.swing.
🚀 Funcionalidades Atuais

    Seleção de Combustível: Utiliza o modelo CombustivelModel para definir preços e tipos de gasolina/etanol.

    Cálculo de Abastecimento: A classe AbastecimentoService processa a quantidade de litros e retorna o valor total bruto.

    Interface Visual: Entrada e saída de dados realizadas via JOptionPane, proporcionando uma experiência fora do console terminal.

    Processamento de Pagamento: Sistema que identifica o método escolhido (PIX, Dinheiro ou Cartão) e aplica descontos automáticos:

        PIX: 10% de desconto.

        Dinheiro: 2% de desconto.

        Cartão: Valor integral.

🏗️ Estrutura do Código (Arquitetura)

O projeto está dividido em pacotes para melhor organização:

    br.com.estudos.app.model: Contém a classe de dados CombustivelModel.

    br.com.estudos.app.service: Contém as regras de negócio (AbastecimentoService e PagamentoService).

    br.com.estudos.app: Classe MainAplication que orquestra o fluxo do programa.

🧠 Aprendizados Técnicos

    Comparação de Strings: Implementação de .equalsIgnoreCase() para evitar erros de digitação do usuário.

    Tipagem: Conversão de String para double usando Double.parseDouble().

    Encapsulamento: Uso de atributos privados e métodos públicos para proteção dos dados.

🛠️ Como rodar

    Certifique-se de ter o JDK 8 ou superior instalado.

    Clone o repositório.

    Execute a classe MainAplication.java.

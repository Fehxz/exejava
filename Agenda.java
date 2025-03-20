import javax.swing.JOptionPane;

public class Agenda {

    public static void main(String[] args) {
        // Entrada dos dados iniciais
        double investimentoMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido por mês:"));
        double taxaJurosMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de juros mensal (em %):")) / 100;
        
        // Loop para realizar os cálculos ano a ano
        double saldo = 0;
        int ano = 1;
        
        while (true) {
            saldo = calcularInvestimento(saldo, investimentoMensal, taxaJurosMensal);

            // Exibe o saldo após 1 ano
            JOptionPane.showMessageDialog(null, String.format("Saldo do investimento após %d ano(s): R$ %.2f", ano, saldo));

            // Pergunta se deseja calcular o próximo ano
            String resposta = JOptionPane.showInputDialog("Deseja processar mais um ano? (S/N)").toUpperCase();
            if (resposta.equals("N")) {
                break; // Sai do loop se a resposta for 'N'
            }

            // Incrementa o contador de anos
            ano++;
        }
    }

    // Método para calcular o saldo do investimento mês a mês, considerando juros compostos
    public static double calcularInvestimento(double saldoAnterior, double investimentoMensal, double taxaJurosMensal) {
        double saldo = saldoAnterior;

        for (int mes = 1; mes <= 12; mes++) {
            saldo += investimentoMensal; // Adiciona o valor do investimento mensal
            saldo *= (1 + taxaJurosMensal); // Aplica a taxa de juros no saldo
        }

        return saldo;
    }
}

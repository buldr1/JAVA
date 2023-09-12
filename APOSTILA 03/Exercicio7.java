import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da roupa: "));
        int metodo = Integer.parseInt(JOptionPane.showInputDialog("Digite o método de pagamento: "));
        double total = 0;
        double porcentagem = valor * 0.1;
        int parcelas = 0;

        switch (metodo) {
            case 0:
                total = valor - porcentagem;

                JOptionPane.showMessageDialog(null, "Valor total: " + total);
                break;
            case 1:
                parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas (Máximo de 12x)"));
                total = valor / parcelas;

                JOptionPane.showMessageDialog(null, "Valor por parcela: " + total);
                break;
            case 2:
                parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas (Máximo de 12x)"));
                total = (valor + porcentagem) / parcelas;

                JOptionPane.showMessageDialog(null, "Valor por parcela: " + total);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");

        }
    }
}
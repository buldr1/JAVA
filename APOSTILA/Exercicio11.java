import javax.swing.JOptionPane;

public class Exercicio11 {
    public static void main(String[] args) {
        int estado = Integer.parseInt(JOptionPane.showInputDialog("Digite o estado: "));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "));
        double desconto = 0;
        double total = 0;

        if (estado == 2 || estado == 5) {
            desconto = valor * 0.12;
            total = valor - desconto;
            JOptionPane.showMessageDialog(null, "Valor final será de: " + total);
        } else if (estado == 1 || estado == 3 || estado == 4) {
            desconto = valor * 0.15;
            total = valor - desconto;
            JOptionPane.showMessageDialog(null, "Valor final será de: " + total);
        } else {
            JOptionPane.showMessageDialog(null, "Estado inválido");
        }

    }
}
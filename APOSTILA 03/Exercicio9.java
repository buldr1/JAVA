import javax.swing.JOptionPane;

public class Exercicio9 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double media = (nota1 + nota2) / 2;
        if (media >= 9) {
            JOptionPane.showMessageDialog(null, "Parabéns, continue assim!");
        } else if (media >= 7 && media < 9) {
            JOptionPane.showMessageDialog(null, "Aprovado.");
        } else if (media >= 6 && media < 7) {
            JOptionPane.showMessageDialog(null, "Aprovado no limite, estude um pouco mais.");
        } else if (media >= 2 && media < 6) {
            JOptionPane.showMessageDialog(null, "Não está aprovado mas ainda pode fazer a segunda época");
        } else if (media < 2) {
            JOptionPane.showMessageDialog(null, "Reprovado. Nos vemos semestre que vem.");
        } 
    }
}
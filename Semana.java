import javax.swing.JOptionPane;

public class Semana {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7: "));
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Domingo");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Segunda-Feira");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Terça-Feira");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quarta-Feira");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, "Quinta-Feira");
            break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sexta-Feira");
            break;
            case 7:
                JOptionPane.showMessageDialog(null, "Sábado");
            break;
            default:
                JOptionPane.showMessageDialog(null, "ERROR");
        }
     }
    
}

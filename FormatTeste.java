import javax.swing.JOptionPane;
public class FormatTeste{
public static void main(String[] args) {
String nome = JOptionPane.showInputDialog("Qual o seu nome?");
int idade =
Integer.parseInt(JOptionPane.showInputDialog("Quantos anos você tem?"));
//concatenando com o operador +
JOptionPane.showMessageDialog(null, "Oi, " + nome + ". Você tem " + idade + " anos.");
//"montando a string com o método format"
String s = String.format ("Oi, %s. Você tem %d anos.", nome, idade);
JOptionPane.showMessageDialog(null, s);
}
}
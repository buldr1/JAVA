import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GerenciadorDeAlunos extends JFrame{
    public static void main(String[] args) {
        GerenciadorDeAlunos ga = new GerenciadorDeAlunos();
        ga.setSize(300, 200);
        ga.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel painel = new JPanel();
        ga.add(painel);
        JLabel loginJLabel = new JLabel("Login");
        painel.add(loginJLabel);
        JTextField login = new JTextField(30);
        painel.add(loginJLabel);
        JLabel senhaLabel = new JLabel("Senha"); 
        painel.add(senhaLabel);
        JPasswordField senha = new JPasswordField(30);
        painel.add(senha);
        JButton cancelar = new JButton("cancelar");
        painel.add(cancelar);
        cancelar.addActionListener(a -> {
            login.setText("");
            senha.setText("");
         });
         JButton ok = new JButton("ok");
         painel.add(ok);
         ga.setVisible(true);
    }
    
    public GerenciadorDeAlunos() {
        super("Login");
    }
    
}

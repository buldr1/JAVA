public class Exercicio15 {
    public static void main(String[] args) {
        double valorPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora: "));
        int horasTrabalhadas = Integer
                .parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        int imposto = Integer.parseInt(JOptionPane.showInputDialog("Imposto está incluso? (0: Não ; 1: Sim)"));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Digite a comissão"));
        double salarioBruto = valorPorHora * horasTrabalhadas;
        double salarioLiquido = 0;
       
        if (imposto != 1 && imposto != 0) {
            JOptionPane.showMessageDialog(null, "Opção de imposto inválida");
        } else {
            if (imposto == 1 && horasTrabalhadas >= 120) {
                salarioLiquido = (salarioBruto - (salarioBruto * 0.1) + comissao);
            } else if (imposto == 0 && horasTrabalhadas >= 120) {
                salarioLiquido = (salarioBruto + comissao);
            } else if (imposto == 1 && horasTrabalhadas < 120) {
                salarioLiquido = (salarioBruto - (salarioBruto * 0.1));
            } else {
                salarioLiquido = salarioBruto;
            }
            JOptionPane.showMessageDialog(null, "Salário total: " + salarioLiquido);
        }

    }
}
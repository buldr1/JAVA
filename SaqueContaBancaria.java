import java.util.Scanner;

public class SaqueContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo da conta bancária: ");
        double saldoConta = scanner.nextDouble();

        System.out.print("Digite o valor a ser sacado: ");
        double valorSaque = scanner.nextDouble();

        if (saldoConta >= valorSaque) {
            double saldoRestante = saldoConta - valorSaque;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Saldo remanescente: " + saldoRestante);
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente.");
        }
        scanner.close();
    }
}
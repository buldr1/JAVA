package psc23;
import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite os coeficientes da equação de segundo grau (a, b e c):");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não há raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("Há uma única raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Há duas raízes reais: Raiz1 = " + raiz1 + " e Raiz2 = " + raiz2);
        }

        input.close();
    }
}


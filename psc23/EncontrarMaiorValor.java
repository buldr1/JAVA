package psc23;
import java.util.Scanner;

public class EncontrarMaiorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite o número A: ");
        double a = sc.nextDouble();
        System.out.println("Digite o número B: ");
        double b = sc.nextDouble();
        System.out.println("Digite o número C: ");
        double c = sc.nextDouble();
        sc.close();
        if ((a > b) && (a > c)) {
            System.out.println("O maior valor é A");
        } else if ((b > a) && (b > c)) {
            System.out.println("O maior valor é B");
        } else if ((c > a) && (c > b)); {
            System.out.println("O maior valor é C");
        }
    }

    
}

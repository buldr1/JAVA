import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        if (n <= 3) {
            System.out.println("É primo");
        } else {
            boolean ePrimo = true;
            for (int div = 2; div < (n -1 ); div++) {
                if ( n % div == 0) {
                    System.out.println("Consegui dividir por: " + div);
                    ePrimo = false;
                }
            }if (ePrimo) {
                System.out.println("É primo");
            } else {
                System.out.println(" Não é primo");

            }
        }    
        sc.close();
    }
    
}

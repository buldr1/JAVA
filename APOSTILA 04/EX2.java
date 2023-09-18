import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double e = 1;
        for (int i = 1; 1 <= n; i++) {
            double fatorial = 1;
            for (int j = 2; j <= i; j++) {
                fatorial *= j;
            }
            e = e + (1/ fatorial);
        }
        System.out.println(e);
        sc.close();
    }
}

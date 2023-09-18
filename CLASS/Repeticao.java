package CLASS;
import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {
        int x = 1;
        Scanner sc = new Scanner(System.in);
        while (x != 0) {
        System.out.println("Digite um número:  ");
        x = sc.nextInt();
        System.out.println(x * x);
        }
        sc.close();
    }
    }


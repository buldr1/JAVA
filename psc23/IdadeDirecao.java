package psc23;
import java.util.Scanner;

public class IdadeDirecao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();
        System.out.println(idade >= 18 ? "Pode dirigir" : "Não pode");
        sc.close();
    }
}

import java.util.Scanner;

public class CalculadoraNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int numero3 = scanner.nextInt();

        int soma = numero1 + numero2 + numero3;
        double media = (double) soma / 3; 
        int produto = numero1 * numero2 * numero3;
        int menor = Math.min(Math.min(numero1, numero2), numero3);
        int maior = Math.max(Math.max(numero1, numero2), numero3);
        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Produto: " + produto);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);

        scanner.close();
    }
}
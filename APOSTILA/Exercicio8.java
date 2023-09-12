import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.print("Digite o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Peso ideal, muito bem.");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Sobrepeso, um regime leve pode ajudar.");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("Obesidade leve.");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("Obesidade moderada.");
        } else {
            System.out.println("Obesidade mórbida.");
        } 
         scanner.close();
    }
}
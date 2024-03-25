import java.util.Scanner;

//11. Escreva um algoritmo que leia três valores inteiros distintos e escreva-os emordem crescente.

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira três valores inteiros distintos
        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        int numero3 = scanner.nextInt();

        // Ordena os números em ordem crescente
        int menor, medio, maior;

        if (numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
            if (numero2 < numero3) {
                medio = numero2;
                maior = numero3;
            } else {
                medio = numero3;
                maior = numero2;
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
            if (numero1 < numero3) {
                medio = numero1;
                maior = numero3;
            } else {
                medio = numero3;
                maior = numero1;
            }
        } else {
            menor = numero3;
            if (numero1 < numero2) {
                medio = numero1;
                maior = numero2;
            } else {
                medio = numero2;
                maior = numero1;
            }
        }

        // Exibe os números em ordem crescente
        System.out.println("Os números em ordem crescente são:");
        System.out.println(menor + ", " + medio + ", " + maior);

        scanner.close();
    }
}



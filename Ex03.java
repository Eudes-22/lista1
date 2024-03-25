import java.util.Scanner;

//3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nasvariáveis A e B e informe qual 
//   deles é o maior. Caso os números sejam iguais informarao usuário que a sequência de números informados é inválida.

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro (A):");
        int A = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro (B):");
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("A sequência de números informados é inválida. Os números são iguais.");
        } else if (A > B) {
            System.out.println("O maior número é: " + A);
        } else {
            System.out.println("O maior número é: " + B);
        }

        scanner.close();
    }
}   


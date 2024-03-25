import java.util.Scanner;

//2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba oresultado da sua soma.

public class Ex02 {
    public class SomaDeDoisNumeros {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Leitura dos números
            System.out.print("Digite o primeiro número: ");
            int num1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = scanner.nextInt();
    
            // Soma dos números
            int soma = num1 + num2;
    
            // Exibição da soma
            System.out.println("A soma dos números é: " + soma);

            scanner.close();
        }
    }
}   


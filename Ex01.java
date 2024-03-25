import java.util.Scanner;

//1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre amensagem “Número maior do que 10!”, caso este número
//   seja maior, ou “Número menor ou igual a 10!”, caso este número seja menor ou igual.

public class Ex01 {
    public class NumeroMaiorOuIgualA10 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Leitura do número
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
    
            // Verificação do número
            if (numero > 10) {
                // Número maior que 10
                System.out.println("Número maior do que 10!");
            } else {
                // Número menor ou igual a 10
                System.out.println("Número menor ou igual a 10!");

                scanner.close();
            }
        }
    }
}
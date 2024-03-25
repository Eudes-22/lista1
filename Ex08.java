import java.util.Scanner;

//8. Escreva um algoritmo que leia um número e mostre uma mensagem caso este número seja maior ou igual a 50, outra se ele for menor
//   que 50.

public class Ex08 {
    public class NumeroMaiorOuMenorQue50 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Leitura do número
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
    
            // Verificação do número
            if (numero >= 50) {
                // Número maior ou igual a 50
                System.out.println("O número digitado é maior ou igual a 50.");
            } else {
                // Número menor que 50
                System.out.println("O número digitado é menor que 50.");
            }

            scanner.close();
        }   
    }




    
}


import java.util.Scanner;

//7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se este número está no intervalo entre 100 e 200. Caso 
//   o número esteja fora do intervaloo usuário também deverá ser informado.

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        // Verifica se o número está dentro do intervalo
        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está dentro do intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }

        scanner.close();
    }
}
    


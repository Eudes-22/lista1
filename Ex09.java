import java.util.Scanner;

//9. Leia dois números nas variáveis A e B e identifique se os valores são iguais ou diferentes. Caso eles sejam iguais imprima
//   uma mensagem dizendo que são iguais.Caso sejam diferentes, informe que são diferentes e qual número é o maior.

public class Ex09 {
    public class NumerosIguaisOuDiferentes {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Leitura dos números
            System.out.print("Digite o valor de A: ");
            int a = scanner.nextInt();
            System.out.print("Digite o valor de B: ");
            int b = scanner.nextInt();
    
            // Comparação dos números
            if (a == b) {
                // Números iguais
                System.out.println("Os números A e B são iguais!");
            } else {
                // Números diferentes
                System.out.println("Os números A e B são diferentes.");
                if (a > b) {
                    // A é maior que B
                    System.out.println("O número A é maior que o número B.");
                } else {
                    // B é maior que A
                    System.out.println("O número B é maior que o número A.");
                }
                scanner.close();
            }
        }
    }
}
    

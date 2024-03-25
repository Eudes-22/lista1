import java.util.Scanner;

//13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo deoperador em outra variável do tipo CARACTERE. Imprima 
//    o resultado da operação de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma mensagem de operador 
//    não definido. Tratar erro de divisão por zero.

public class Ex13 {
    public class CalculadoraSimples {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Leitura dos valores
            System.out.print("Digite o valor de A: ");
            double a = scanner.nextDouble();
            System.out.print("Digite o valor de B: ");
            double b = scanner.nextDouble();
            System.out.print("Digite o operador (+, -, *, /): ");
            String operador = scanner.next();
    
            // Verificação do operador
            switch (operador) {
                case "+":
                    // Soma
                    System.out.println("A soma de A e B é: " + (a + b));
                    break;
                case "-":
                    // Subtração
                    System.out.println("A subtração de A e B é: " + (a - b));
                    break;
                case "*":
                    // Multiplicação
                    System.out.println("A multiplicação de A e B é: " + (a * b));
                    break;
                case "/":
                    // Divisão
                    if (b == 0) {
                        // Divisão por zero
                        System.out.println("Divisão por zero! Operação inválida.");
                    } else {
                        System.out.println("A divisão de A e B é: " + (a / b));
                    }
                    break;
                default:
                    // Operador inválido
                    System.out.println("Operador inválido!");

                    
                    scanner.close();
            }
        }
    }
}


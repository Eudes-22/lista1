import java.util.Scanner;

//5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valorda variável A passe a ser o valor da variável
//   B e o valor da variável B passe a ser ovalor da variável A. Apresentar uma mensagem com o valor original de cada variávele outra
//   com os valores trocados.

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os dois números
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        // Realiza as operações matemáticas
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        // Exibe os resultados
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();
    }
}
    



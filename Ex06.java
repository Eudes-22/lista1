import java.util.Scanner;

//6. Ler uma temperatura em graus Celsius e apresentá-la convertida em grausFahrenheit. A fórmula de conversão é: 
//   F = (9 * C + 160) / 5

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura em Celsius
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();

        // Converte a temperatura para Fahrenheit
        double fahrenheit = (9 * celsius + 160) / 5;

        // Exibe a temperatura convertida
        System.out.println("Temperatura em graus Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}



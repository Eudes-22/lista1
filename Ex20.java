import java.util.Scanner;

//20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem, 
//    utilizando um automóvel que faz 12km por litro e considerando que são fornecidoso tempo em hora 
//    e a velocidade média da viagem.

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tempo de viagem em horas
        System.out.println("Digite o tempo da viagem em horas:");
        double tempoViagem = scanner.nextDouble();

        // Solicita a velocidade média da viagem em km/h
        System.out.println("Digite a velocidade média da viagem em km/h:");
        double velocidadeMedia = scanner.nextDouble();

        // Define a quantidade de quilômetros por litro
        double kmPorLitro = 12.0;

        // Calcula a distância em km
        double distancia = tempoViagem * velocidadeMedia;

        // Calcula a quantidade de litros de combustível gasta
        double litrosCombustivel = distancia / kmPorLitro;

        // Exibe a quantidade de litros de combustível gasta
        System.out.println("Quantidade de litros de combustível gasta: " + litrosCombustivel);

        scanner.close();
    }
}
    







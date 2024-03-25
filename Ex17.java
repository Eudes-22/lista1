import java.util.Scanner;

//17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes acada nota e retorne a sua média ponderada.
//    Veja o cálculo da média ponderada: 
//    Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3peso1+ peso2 + peso3Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, 
//    peso1 = 5, peso2 = 3, peso3 = 2Média ponderada = 8.25

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as três notas
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();

        // Calcula a média aritmética das notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe a média com duas casas decimais
        System.out.printf("Média: %.2f%n", media);

        scanner.close();
    }
}










import java.util.Scanner;

//16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaaritmética. 
//    Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83

public class Ex16 {
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







import java.util.Scanner;

//18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaharmônica.
//    Média harmônica = 31 + 1 + 1nota1 nota2 nota3Exemplo:nota1 = 10, nota2 = 5.5, nota3 = 8 Média: 7.37

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita as três notas ao usuário
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        
        // Calcula a média harmônica
        double mediaHarmonica = calcularMediaHarmonica(nota1, nota2, nota3);
        
        // Exibe a média harmônica
        System.out.println("Média Harmônica: " + mediaHarmonica);
        
        scanner.close();
    }
    
    public static double calcularMediaHarmonica(double nota1, double nota2, double nota3) {
        double mediaHarmonica;
        
        // Calcula a média harmônica usando a fórmula
        mediaHarmonica = 3 / ((1/nota1) + (1/nota2) + (1/nota3));
        
        return mediaHarmonica;
    }
}
    







import java.util.Scanner;

//14. A expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA). Nesta fórmula, temos que an é o termo
//    de ordem n (n-ésimo termo),r é a razão e a1 é o primeiro termo da Progressão Aritmética. 
//    Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os valores de a1, n e r
        System.out.println("Digite o primeiro termo (a1) da progressão aritmética:");
        int a1 = scanner.nextInt();

        System.out.println("Digite o valor de n (ordem do termo a ser encontrado):");
        int n = scanner.nextInt();

        System.out.println("Digite a razão (r) da progressão aritmética:");
        int r = scanner.nextInt();

        // Calcula o n-ésimo termo da progressão aritmética
        int an = a1 + (n - 1) * r;

        // Exibe o resultado
        System.out.println("O " + n + "-ésimo termo da progressão aritmética é: " + an);

        scanner.close();
    }
}



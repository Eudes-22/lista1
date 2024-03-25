import java.util.Scanner;

//12. Escreva um algoritmo que receba o número do mês e mostre o mêscorrespondente. Valide mês inválido.

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura do número do mês
        System.out.print("Digite o número do mês (1 a 12): ");
        int numeroMes = scanner.nextInt();

        // Verificação do número do mês
        if (numeroMes >= 1 && numeroMes <= 12) {
            // Número do mês válido
            switch (numeroMes) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
            }
        } else {
            // Número do mês inválido
            System.out.println("Mês inválido!");

            scanner.close();
        }
    }
}

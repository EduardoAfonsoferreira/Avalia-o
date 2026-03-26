import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /// Recebe o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        /// Recebe um número positivo
        System.out.print("Digite um número positivo: ");
        int n = scanner.nextInt();

        /// Crescente: de 0 até n
        System.out.println("\nCrescente:");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }

        /// Decrescente: de n até 0
        System.out.println("\nDecrescente:");
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }

        /// Verifica tamanho do nome
        System.out.println("\n");

        if (nome.length() > 6) {
            System.out.println("Nome com mais de 6 letras:");
            for (int i = 0; i < n; i++) {
                System.out.println(nome);
            }
        } else {
            System.out.println("Nome com 6 letras ou menos:");
            System.out.println(nome);
        }

        scanner.close();
    }
}
import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        System.out.println("Por favor insira dois numeros inteiros que deseja comparar");
        Scanner scanner = new Scanner(System.in);
        int inteiro1 = scanner.nextInt();
        int inteiro2 = scanner.nextInt();
        if (inteiro1 > inteiro2)
            System.out.println("O primeiro inteiro e maior!");

        else if (inteiro1 < inteiro2) {
                        System.out.println("o segundo inteiro e maior! ");

        } else {
            System.out.println("Os numeros inteiros são iguais!");
        }






    }
}
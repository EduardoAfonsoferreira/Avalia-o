import java.util.Scanner;

public class Main {
    /// defino inicio de leitura do progama ///
    public static void main(
            String[] args) {
        /// chamo a função Scaner para interação com usuario
        Scanner scanner = new Scanner(System.in);
        /// chamo a funçao print para mensagem de boas vindas e solicito dados
        System.out.println("Bem vindo, por favor insira dados solicitados");
        System.out.println("Nome completo");
        /// uso a função string e nextLine para leitura de texto
        String  nome = scanner.nextLine();
        /// mesmo se tratando de numeros o cpf o usuario pode usar . ou - entao foi utilizando o mesmo metodo para leitura de texto
        System.out.println("Cpf");
        String  cpf = scanner.nextLine();
        ///  como se tratando de idade foi usado metodo Int para leitura de numeros inteiros
        System.out.println("idade");
        int  idade = scanner.nextInt();
        /// como altura se trata de um numero decimal muitas vezes fiz uso do metodo double
        System.out.println("Altura");
        double  altura = scanner.nextDouble();
        /// para peso fiz o mesmo uso de double pelo usuario poder acabar colocando mais numeros doque o inteiro
        System.out.println("peso");
        double  peso = scanner.nextDouble();
        /// aqui utilizei scanner.nextLine para evitar que pulasse a leitura da ultima interação
        scanner.nextLine();
        /// para estado civil usei metodo string line
        System.out.println("Estado civíl");
        String  civil = scanner.nextLine();

/// e aqui fechei o uso do scanner
        scanner.close();
/// usei a funçao println para informar os valores e textos coletados
        System.out.println("O seu nome e "+nome+",seu CPF e "+cpf+",sua idade e "+idade+",sua altura e "+altura+",seu peso e "+peso+" e seu estado civil e "+civil+".");


    }
}
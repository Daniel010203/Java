import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        // Exibição da mensagem
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo é %.2f.%n",
                nomeCliente, agencia, numero, saldo);
    }
}


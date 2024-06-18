import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String menu = "\n[d] Depositar\n[s] Sacar\n[e] Extrato\n[q] Sair\n\n=> ";
        double saldo = 0;
        double limite = 500;
        String extrato = "";
        int numeroSaques = 0;
        final int LIMITE_SAQUES = 3;

        while (true) {
            System.out.print(menu);
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "d":
                    System.out.print("Informe o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha restante

                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        extrato += String.format("Depósito: R$ %.2f\n", valorDeposito);
                    } else {
                        System.out.println("Operação falhou! O valor informado é inválido.");
                    }
                    break;

                case "s":
                    System.out.print("Informe o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha restante

                    boolean excedeuSaldo = valorSaque > saldo;
                    boolean excedeuLimite = valorSaque > limite;
                    boolean excedeuSaques = numeroSaques >= LIMITE_SAQUES;

                    if (excedeuSaldo) {
                        System.out.println("Operação falhou! Você não tem saldo suficiente.");
                    } else if (excedeuLimite) {
                        System.out.println("Operação falhou! O valor do saque excede o limite.");
                    } else if (excedeuSaques) {
                        System.out.println("Operação falhou! Número máximo de saques excedido.");
                    } else if (valorSaque > 0) {
                        saldo -= valorSaque;
                        extrato += String.format("Saque: R$ %.2f\n", valorSaque);
                        numeroSaques += 1;
                    } else {
                        System.out.println("Operação falhou! O valor informado é inválido.");
                    }
                    break;

                case "e":
                    System.out.println("\n================ EXTRATO ================");
                    if (extrato.isEmpty()) {
                        System.out.println("Não foram realizadas movimentações.");
                    } else {
                        System.out.print(extrato);
                    }
                    System.out.printf("\nSaldo: R$ %.2f\n", saldo);
                    System.out.println("==========================================");
                    break;

                case "q":
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Operação inválida, por favor selecione novamente a operação desejada.");
            }
        }
    }
}


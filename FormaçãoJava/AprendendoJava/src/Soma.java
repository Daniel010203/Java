

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores inteiros
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Cálculo da soma
        int soma = a + b;

        // Exibição do resultado
        System.out.println("SOMA = " + soma);

        // Fechamento do Scanner
        scanner.close();
    }

    @Override
    public String toString() {
        return "Soma []";
    }
}

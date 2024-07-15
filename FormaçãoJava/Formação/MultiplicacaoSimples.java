package FormaçãoJava.Formação;

import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores inteiros
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Cálculo do produto
        int prod = a * b;

        // Exibição do resultado
        System.out.println("PROD = " + prod);
    }
}

/*  */

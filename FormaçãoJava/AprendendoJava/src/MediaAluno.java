

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das notas
        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();

        // Cálculo da média ponderada
        double pesoA = 3.5;
        double pesoB = 7.5;
        double somaPesos = pesoA + pesoB;
        double media = (notaA * pesoA + notaB * pesoB) / somaPesos;

        // Exibição do resultado com 5 dígitos após o ponto decimal
        System.out.printf("MEDIA = %.5f%n", media);
    }
}

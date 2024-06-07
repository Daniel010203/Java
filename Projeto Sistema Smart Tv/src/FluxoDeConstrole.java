import java.util.Scanner;

public class FluxoDeConstrole {
    public static void main(String[] args) {
        
        int idade = 80;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        if (idade >=18 && idade <70) {
            System.out.println("Maior idade");
            } else if (idade >= 70)
            System.out.println("Terceira idade.");{
            System.out.println("Menor idade.");
        }  
    }
}

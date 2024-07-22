public class ExemploWhile {
    public static void main(String[] args) {
        double dinheiro = 50.0;  // Quantidade inicial de dinheiro
        double precoDoce = 5.0;  // Preço de cada doce
        int quantidadeDocesComprados = 0;  // Contador de doces comprados

        while (dinheiro >= precoDoce) {
            // Comprar um doce
            dinheiro -= precoDoce;
            quantidadeDocesComprados++;
            
            // Mostrar o status atual
            System.out.println("Você comprou um doce! Doces comprados: " + quantidadeDocesComprados);
            System.out.println("Dinheiro restante: R$" + dinheiro);
        }

        System.out.println("Você não tem mais dinheiro suficiente para comprar outro doce.");
        System.out.println("Total de doces comprados: " + quantidadeDocesComprados);
        System.out.println("Dinheiro restante: R$" + dinheiro);
    }
}


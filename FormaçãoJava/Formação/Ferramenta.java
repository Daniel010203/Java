package FormaçãoJava.Formação;

class CompraFerramenta {
    public static void main(String[] args) {
        double precoFerramenta = 50.00;
        double dinheiroDisponivel = 60.00; // Valor que o operador possui

        if (dinheiroDisponivel >= precoFerramenta) {
            System.out.println("O operador comprou a ferramenta.");
        } else {
            System.out.println("O operador não comprou a ferramenta, pois não possui dinheiro suficiente.");
        }
    }
}
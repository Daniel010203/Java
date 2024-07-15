
public class MinhaClasse {
    public static void main(String[] args) {
        String meuNome = "Fulano";
        int anoFabricacao = 2022;
        boolean verdadeiro = false;
        String primeiroNome = "Daniel";
        String segundoNome = "Vieira";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        int numero = 15;

        System.out.println(++numero);
        System.out.println(numero);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome,String segundoNome){
        return "Resultado do método " + primeiroNome.concat(segundoNome);
    }

}

public class MinhaClasse {
    public static void main(String[] args) {
     
        String nommeCompleto = nomeCompleto(primeiroNome, segudoNome);

        System.out.println(nommeCompleto);
    }
public static String nomeCompleto (String primeiroNome,String segudoNome) {
    return "resultado do Metodo" + primeiroNome.concat("").concat(segudoNome);
}
}

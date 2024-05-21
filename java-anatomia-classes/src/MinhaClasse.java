public class MinhaClasse {
    
public static void main(String[] args) {
    String primeiroNome = "Daniel";
    String segundooNome = "Oliveira";
    String nomeCompleto =  nomeCompleto (primeiroNome,segundooNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat("").concat(segundoNome);
}

}

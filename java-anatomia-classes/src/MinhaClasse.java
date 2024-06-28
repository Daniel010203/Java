public class MinhaClasse {
    
public static void main(String[] args) {
    String primeiroNome = "Daniel";
    String segundooNome = "Oliveira";
    String nomeCompleto =  nomeCompleto (primeiroNome,segundooNome);
    String nome = "FIAP";
    String slogan  = "A vamos aprender Java e ganhar dinheiro";
    String aprender1 = nome + slogan;
    aprender1 += " - ";
    aprender1 += slogan;
    String aprende1 = nome.concat(" - ").concat(slogan);
    String nome2 = new String("FIAP");
    if (nome.equals(nome2)){
        System.out.println("As Strings são iguais");
    }else{
        System.out.println("As Strings são diferentes");
    }
    System.out.println(nomeCompleto);
    System.out.println("Faculdade: \"FIAP\"");
    System.out.println(aprender1);
    System.out.println(aprender1);

    
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat("").concat(segundoNome);
}

}

public class PlanoOperadora2 {
    public static void main(String[] args) {
        String plano = "M"; // Inicialize a variável com um valor apropriado
        
        switch (plano) {
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            case "M":
                System.out.println("100 minutos de ligação e Whats e Insta Grátis !");
                break;
            case "T":
                System.out.println("100 minutos de ligação, Whats e Insta grátis + 5Gb de YouTube por conta da casa !");
                break;
            default:
                System.out.println("Plano não reconhecido");
                break;
        }
    }
}

        

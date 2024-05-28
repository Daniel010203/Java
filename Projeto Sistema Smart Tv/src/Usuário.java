public class Usuário {
    public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada ?" + smartTv.ligada);
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Voluma Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status" + smartTv.ligada);

    }

}

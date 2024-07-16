package Usuario;

public class SmartTv {

    private String ligada;
    private String canal;

    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ?" + smartTv.ligada);
        System.out.println("Canal atual" + smartTv.canal);
        System.out.println("Volume Atual" + smartTv);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ?" + smartTv.ligada);
    }

    private void ligar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ligar'");
    }

}

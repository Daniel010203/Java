public class TesteConta {

    public static void main(String[] args) {
        Conta cc = new Conta(1000,50.0);
        cc.setNumero(1000);

        System.out.println(cc.recuperarSaldo());
    }
}
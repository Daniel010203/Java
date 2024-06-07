package Novo2;

public class Novo2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int x = 10;
        double d = x;
        long l = x;
        float h = 2;
        short s = 20;
        x = s;

        double valorDoublle = 9.99;
        int valorInt = (int) valorDoublle;
        System.out.println(valorInt);
    }

    @Override
    public String toString() {
        return "Novo2 []";
    }

}

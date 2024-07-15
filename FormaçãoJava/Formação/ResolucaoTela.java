package FormaçãoJava.Formação;
import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;

public class ResolucaoTela {
    public static void main(String[] args) {
        DisplayMode displayMode = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getDefaultScreenDevice().getDisplayMode();
        int largura = displayMode.getWidth();
        int altura = displayMode.getHeight();

        System.out.println("A resolução da sua tela é: " + largura + " x " + altura);
    }
}

import java.util.HashMap;.5HashMap;

public class NotasAlunos {

    public static HashMap<String, Object> notas(boolean sit, double... notas) {
        HashMap<String, Object> dic = new HashMap<>();

        int totalNotas = notas.length;
        double maiorNota = Double.NEGATIVE_INFINITY;
        double menorNota = Double.POSITIVE_INFINITY;
        double somaNotas = 0;

        for (double nota : notas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
            somaNotas += nota;
        }

        double media = somaNotas / totalNotas;

        dic.put("total", totalNotas);
        dic.put("maior", maiorNota);
        dic.put("menor", menorNota);
        dic.put("media", media);

        if (sit) {
            if (media >= 7) {
                dic.put("Situação", "Boa");
            } else if (media > 5) {
                dic.put("Situação", "Razoável");
            } else {
                dic.put("Situação", "Ruim");
            }
        }

        return dic;
    }

    public static void main(String[] args) {
        HashMap<String, Object> resp = notas(true, 8.5, 10, 6.5);
        System.out.println(resp);
    }
}


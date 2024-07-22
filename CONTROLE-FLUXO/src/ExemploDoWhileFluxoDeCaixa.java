 public class ExemploDoWhileFluxoDeCaixa {
        public static void main(String[] args) {
            // Suponha que esses são os valores das vendas mensais em R$
            double[] vendasMensais = {55000, 49000, 60000, 47000, 62000, 58000, 45000, 61000, 49000, 60000, 53000, 51000};
    
            double ticketMedioEsperado = 60000;
            double ticketMedioLimite = 50000;
    
            int mes = 0;
            do {
                double vendaMensal = vendasMensais[mes];
                System.out.println("Verificando o mês " + (mes + 1) + ": Venda mensal = R$" + vendaMensal);
    
                if (vendaMensal < ticketMedioLimite) {
                    System.out.println("Alerta: O ticket médio de vendas do mês " + (mes + 1) + " está abaixo de R$" + ticketMedioLimite + "!");
                } else {
                    System.out.println("O ticket médio de vendas do mês " + (mes + 1) + " está dentro do esperado.");
                }
    
                mes++;
            } while (mes < vendasMensais.length);
        }
    }
    

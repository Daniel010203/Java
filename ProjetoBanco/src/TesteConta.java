public class TesteConta {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.5;
        contaCorrente.cliente = "Leandro";
        contaCorrente.cliente = 28;

        contaPoupanca.numero = 22;
        contaPoupanca.saldo = 30;
        contaPoupanca.cliente = "Fulano";
        contaPoupanca.cliente = 50;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente = "Leandro";
        contaInvestimento.cliente = 60;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.nome);
        System.out.println(contaCorrente.idade);
    }
}

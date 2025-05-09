package ProjetoBanco;

public class Banco {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("João", "111.222.333-44");
        Cliente cliente2 = new Cliente("Pedro", "111.222.333-44");

        IConta cc = new ContaCorrente(cliente1);
        IConta cp = new ContaPoupanca(cliente2);

        cc.depositar(1000);
        cp.depositar(500);

        cc.transferir(250, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}

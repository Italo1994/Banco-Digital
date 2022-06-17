package view;

import model.*;

public class App {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente();
        cl1.setNome("Italo Hortiz do Nascimento");
        Conta cc = new ContaCorrente(cl1);
        Conta cp = new ContaPoupanca(cl1);

        cc.depositar(1000);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

package view;

import model.*;

public class App {
    public static void main(String[] args) {
        Cliente cl1 = new Cliente();
        cl1.setNome("Italo Hortiz do Nascimento");

        Conta cc = new ContaCorrente(cl1);
        Conta cp = new ContaPoupanca(cl1);

        Banco banco1 = new Banco();
        banco1.setNome("Banco do Brasil");

        cc.depositar(1000);
        cc.transferir(100, cp);

        banco1.adicionarConta(cc);
        banco1.adicionarConta(cp);
        banco1.imprimirContas();

//        cc.imprimirExtrato();
//        cp.imprimirExtrato();
    }
}

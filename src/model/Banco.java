package model;

import java.util.Set;
import java.util.HashSet;

public class Banco {
    private static int NUMERO_DE_CONTAS = 0;
    private String nome;
    private Set<Conta> contas;

    public Banco() {
        contas = new HashSet<Conta>();
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        NUMERO_DE_CONTAS++;
    }
    public void imprimirContas() {
        System.out.println(String.format("Instituição Bancária: %s", this.nome));
        System.out.println(String.format("Quantidade de Contas Cadastradas: %d", this.NUMERO_DE_CONTAS));
        for(Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }

}

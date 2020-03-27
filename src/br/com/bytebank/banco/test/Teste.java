package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {
    public static void main(String[] args) {
        GuardadorDeContas guardadorDeContas = new GuardadorDeContas();

        Conta cc = new ContaCorrente(22,11);
        guardadorDeContas.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,22);
        guardadorDeContas.adiciona(cc2);

        int tamanho = guardadorDeContas.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardadorDeContas.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}

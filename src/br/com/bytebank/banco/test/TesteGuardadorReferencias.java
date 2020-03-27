package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {
    public static void main(String[] args) {
        GuardadorDeReferencias guardadorDeReferencias = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22,11);
        guardadorDeReferencias.adiciona(cc);

        Conta cc2 = new ContaCorrente(22,22);
        guardadorDeReferencias.adiciona(cc2);

        int tamanho = guardadorDeReferencias.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta)guardadorDeReferencias.getReferencia(0);
        System.out.println(ref.getNumero());
    }
}

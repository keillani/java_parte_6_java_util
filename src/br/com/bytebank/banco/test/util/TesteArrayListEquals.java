package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente (22,22);
        Conta cc2 = new ContaCorrente (22,22);


        lista.add(cc1);

        boolean existe = lista.contains(cc2);
        System.out.println("Já existe?" + existe);

        boolean igual = cc1.equals(cc2);
        System.out.println(igual); //deve imprimir true devido método equals ser reescrito para referencia do mesmo objeto


        for (Conta conta : lista){
            System.out.println(conta);
        }

    }

}

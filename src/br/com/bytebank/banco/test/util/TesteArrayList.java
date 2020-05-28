package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.*;

public class TesteArrayList {
    public static void main(String[] args) {

        //Generics <>
        List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
//        List<Conta> lista = new LinkedList<Conta>(); //lista linkada
//        List<Conta> lista = new Vector<Conta>(); //usa array por baixo, mas tbm é threadsafe


        Conta cc = new ContaCorrente (22,11);
//        Cliente cliente = new Cliente();
        lista.add(cc);

        Conta cc2 = new ContaCorrente (22,22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        //Com o Generics não precisa do cast
        //Conta ref = (Conta) lista.get(0);
        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33,311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33,411);
        lista.add(cc4);

        for (int i=0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-------------");

        for (Object oRef : lista){
            System.out.println(oRef);
        }

    }

}

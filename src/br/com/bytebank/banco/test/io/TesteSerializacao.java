package br.com.bytebank.banco.test.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Cliente cliente = new Cliente();
		cliente.setNome("Keillani");
		cliente.setProfissao("dev");
		cliente.setCpf("321654987");
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.setTitular(cliente);
		cc.deposita(220.3);
		
		ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oss.writeObject(cc);
		oss.close();
	}

}

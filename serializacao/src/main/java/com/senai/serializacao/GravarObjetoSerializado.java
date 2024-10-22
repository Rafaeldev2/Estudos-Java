package com.senai.serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GravarObjetoSerializado {
	public static void gravarCliente(Cliente cliente, String nomeArquivo) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(cliente);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}

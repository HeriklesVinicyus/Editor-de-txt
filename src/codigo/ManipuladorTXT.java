package codigo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ManipuladorTXT {
	public void escreverNoArquivo(String texto, String caminhoArquivo) throws IOException {
		FileWriter arq = new FileWriter(caminhoArquivo);
		PrintWriter gravarArq = new PrintWriter(arq);

		gravarArq.printf(texto);

		arq.close();
	}
	

	public String carregarTextoDoArquivo(String caminhoArquivo) throws FileNotFoundException {
		FileReader arq = new FileReader(caminhoArquivo);
		BufferedReader lerArq = new BufferedReader(arq);
		String resp = null;
		
		try {
			resp = lerArq.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			arq.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return resp;
	}


}


package telaTerminal;

import java.io.IOException;
import java.util.Scanner;

import codigo.ManipuladorTXT;

public class TelaTerminal {
	public static void main(String[] args) throws IOException {

		ManipuladorTXT manipulador = new ManipuladorTXT();

		String res = "", diretorioArquivo = new Scanner(System.in).nextLine();
		String linha = manipulador
				.carregarTextoDoArquivo(diretorioArquivo);

		for (int i = 1; i < 20; i++) {
			res = "";
			String splitAux = "";
			if (i < 10)
				splitAux = " 0" + i + " ";
			else
				splitAux = " " + i + " ";

			String[] linhaAux = linha.split(splitAux);

			for (int j = 0; j < linhaAux.length; j++) {
				res += linhaAux[j] + ", 0" + i + " \n";
			}
			linha = res;
		}

		for (int i = 0; i < 32; i++) {
			res = "";
			String splitAux = "";
			if (i < 10)
				splitAux = " 0" + i + "/";
			else
				splitAux = " " + i + "/";

			String[] linhaAux = linha.split(splitAux);

			for (int j = 0; j < linhaAux.length; j++) {
				res += linhaAux[j] + ", " + splitAux;
			}
			linha = res;
		}
		String nomeFinal = (diretorioArquivo.split("."))[0];
		
		manipulador.escreverNoArquivo(linha, nomeFinal+"Final.txt");

		System.out.println();
	}

}

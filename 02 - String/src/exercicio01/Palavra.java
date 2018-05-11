package exercicio01;

import javax.swing.JOptionPane;

public class Palavra {

	String palavra = "";

	String palavrafinal = "";

	char letra1;

	String charfinal = "";
	String charfinallow = "";

	public void obterPalavra() {

		palavra = JOptionPane.showInputDialog("Informe uma palavra");

	}

	public void alternarPalavra() {

		for (int i = 0; i < palavra.length(); i++) {

			if (i % 2 == 0) {

				letra1 = palavra.charAt(i);
				charfinal = String.valueOf(letra1);
				palavrafinal += charfinal.toUpperCase();

			} else {

				letra1 = palavra.charAt(i);
				charfinallow = String.valueOf(letra1);
				palavrafinal += charfinallow.toLowerCase();

			}

		}

		JOptionPane.showMessageDialog(null, palavrafinal);
		
	}

}

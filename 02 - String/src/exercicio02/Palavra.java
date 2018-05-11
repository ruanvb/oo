package exercicio02;

import javax.swing.JOptionPane;

public class Palavra {

	String frase = "";
	String letra = "";

	int vogal = 0;

	public void obterFrase() {

		frase = JOptionPane.showInputDialog("Informe uma palavra ou frase");

	}

	public void obterVogais() {

		for (int i = 0; i < frase.length(); i++) {

			letra = String.valueOf(frase.charAt(i));

			if ((letra.toLowerCase().equals("a")) || (letra.toLowerCase().equals("e"))
					|| (letra.toLowerCase().equals("i")) || (letra.toLowerCase().equals("o"))
					|| (letra.toLowerCase().equals("u"))) {

				vogal++;

			}

		}

	}

	public void laco() {

		obterFrase();
		obterVogais();

		JOptionPane.showMessageDialog(null, frase + "\n\nO número de vogais da frase acima é: " + vogal);

	}

}

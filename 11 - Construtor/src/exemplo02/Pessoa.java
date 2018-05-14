package exemplo02;

import javax.swing.JOptionPane;

public class Pessoa {

	// Construtor 01
	public Pessoa() {
		JOptionPane.showMessageDialog(null, "Bom dia!");
	}

	// Construtor 02
	public Pessoa(String nome) {

		JOptionPane.showMessageDialog(null, "Bom dia, " + nome);

	}

	// Construtor 03
	public Pessoa(String nome, String sobrenome) {
		JOptionPane.showMessageDialog(null, "Bom dia, " + nome + " " + sobrenome);
	}
	
}

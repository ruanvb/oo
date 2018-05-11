//Classe = Molde

package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	// Atributos
	String nome;
	int idade;
	double peso, altura;

	// M�todo de apresenta��o
	public void apresentacao() {
		JOptionPane.showMessageDialog(null, "Ol�! Meu nome � " + nome + ".");
	}

	// M�todo para informar se � maior de idade
	public void verificarIdade() {

		// Situa��o
		String situacao = idade >= 18 ? "Maior de idade" : "Menor de idade";

		// Exibir situa��o
		JOptionPane.showMessageDialog(null, situacao);

	}

	// M�todo para realizar o c�lculo de IMC
	public double calculoIMC() {

		// Vari�vel contendo o c�luclo de imc
		double imc = peso / Math.pow(altura, 2);

		// Retorno
		return imc;

	}

	// M�todo para exibir a situa��o do IMC da pessoa
	public void situacaoIMC() {

		// Obter o c�lculo de IMC
		double imc = calculoIMC();

		// Situa��o
		if (imc < 17) {
			JOptionPane.showMessageDialog(null, "Muito abaixo do peso");
		} else if (imc < 18.5) {
			JOptionPane.showMessageDialog(null, "Abaixo do peso");
		} else if (imc < 25) {
			JOptionPane.showMessageDialog(null, "Peso normal");
		} else if (imc < 30) {
			JOptionPane.showMessageDialog(null, "Obesidade I");
		} else if (imc < 35) {
			JOptionPane.showMessageDialog(null, "Obesidade II");
		} else {
			JOptionPane.showMessageDialog(null, "Obesidade III");
		}

	}

}

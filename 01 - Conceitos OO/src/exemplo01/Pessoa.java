//Classe = Molde

package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	// Atributos
	String nome;
	int idade;
	double peso, altura;

	// Método de apresentação
	public void apresentacao() {
		JOptionPane.showMessageDialog(null, "Olá! Meu nome é " + nome + ".");
	}

	// Método para informar se é maior de idade
	public void verificarIdade() {

		// Situação
		String situacao = idade >= 18 ? "Maior de idade" : "Menor de idade";

		// Exibir situação
		JOptionPane.showMessageDialog(null, situacao);

	}

	// Método para realizar o cálculo de IMC
	public double calculoIMC() {

		// Variável contendo o cáluclo de imc
		double imc = peso / Math.pow(altura, 2);

		// Retorno
		return imc;

	}

	// Método para exibir a situação do IMC da pessoa
	public void situacaoIMC() {

		// Obter o cálculo de IMC
		double imc = calculoIMC();

		// Situação
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

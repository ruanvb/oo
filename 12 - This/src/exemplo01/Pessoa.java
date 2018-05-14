package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	//Atributo da classe
	private int idade;
	
	//Método para informar se é maior de idade
	private void maiorIdade() {
		
		//THIS -> Referencia a variável fora do método.
		
		//Variável local
		int idade = 0;
		
		JOptionPane.showMessageDialog(null, this.idade >= 18 ? "Maior de idade" : "Menor de idade");
	}
	
	//Construtor
	public Pessoa() {
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade."));
		maiorIdade();
		
	}
	
}

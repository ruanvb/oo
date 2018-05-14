package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	/* 
	 	Encapsular -> Visibilidade dos atributos e m�todos
	 	
	  	DEFAULT    -> Atributos e m�todos vis�veis no mesmo pacote.
	  	PUBLIC     -> Atributos e m�todos vis�veis para qualquer classe.
	  	PRIVATE    -> Atributos e m�todos vis�veis apenas na classe que foram criados.
	 	PROTECTED  -> Atributos e m�todos vis�veis nas classes criadas ou herdadas.
	 	
	 */
	
	//Atributos da classe Pessoa
	private String nome;
	private double peso, altura;
	
	//M�todo para retornar o c�lculo de IMC
	private double calculoIMC(){

		double imc = peso/Math.pow(altura, 2);
		
		return imc;
		
	}
		
	//M�todo para retornar a situa��o do IMC
	private String situacao(){
		
		//Obter o c�lculo de IMC
		double imc = calculoIMC();
		
		//Vari�vel contendo a situa��o
		String situacao = "";
		
		//Condicional
		if(imc < 17){
			situacao = "Muito abaixo do peso.";
		} else if(imc < 18.5){
			situacao = "Abaixo do peso.";
		} else if(imc < 25){
			situacao = "Peso normal.";
		} else if(imc < 30){
			situacao = "Acima do peso.";
		} else if(imc < 35){
			situacao = "Obesidade I.";
		} else if(imc < 40){
			situacao = "Obesidade II.";
		} else {
			situacao = "Obesidade III.";
		}
		
		//Retorno
		return situacao;
		
	}
	
	//M�todo para exibir a situa��o do IMC
	private void exibirSituacao(){
		JOptionPane.showMessageDialog(null, nome+ " tem a situa��o:  "+situacao());
	}
	
	//M�todo para obter o peso e a altura
	public void obterDados(){
		
		nome = JOptionPane.showInputDialog("Informe seu nome");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		exibirSituacao();
	}
	
	
	
}

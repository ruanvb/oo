package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	/* 
	 	Encapsular -> Visibilidade dos atributos e métodos
	 	
	  	DEFAULT    -> Atributos e métodos visíveis no mesmo pacote.
	  	PUBLIC     -> Atributos e métodos visíveis para qualquer classe.
	  	PRIVATE    -> Atributos e métodos visíveis apenas na classe que foram criados.
	 	PROTECTED  -> Atributos e métodos visíveis nas classes criadas ou herdadas.
	 	
	 */
	
	//Atributos da classe Pessoa
	private String nome;
	private double peso, altura;
	
	//Método para retornar o cálculo de IMC
	private double calculoIMC(){

		double imc = peso/Math.pow(altura, 2);
		
		return imc;
		
	}
		
	//Método para retornar a situação do IMC
	private String situacao(){
		
		//Obter o cálculo de IMC
		double imc = calculoIMC();
		
		//Variável contendo a situação
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
	
	//Método para exibir a situação do IMC
	private void exibirSituacao(){
		JOptionPane.showMessageDialog(null, nome+ " tem a situação:  "+situacao());
	}
	
	//Método para obter o peso e a altura
	public void obterDados(){
		
		nome = JOptionPane.showInputDialog("Informe seu nome");
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura"));
		
		exibirSituacao();
	}
	
	
	
}

package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	// Atributos
	String nome;
	double nota1, nota2, nota3;

	// Obter os dados do aluno
	public void obterDados() {

		nome = JOptionPane.showInputDialog("Bom dia!\nQual é o seu nome?");

		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1ª nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2ª nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3ª nota"));

	}

	// Realizar a média
	public double calcularMedia() {

		double media = (nota1 + nota2 + nota3) / 3;

		return media;

	}

	// Obter a condição
	public String condicao(){

		String condicao =  calcularMedia() >= 7 ? "Aprovado" : "Reprovado";
		
		return condicao;
		
	}
	
	//Exibir informações do aluno
	public void informacoes(){
		
		JOptionPane.showMessageDialog(null, "O aluno " + nome + " obteve média: " + calcularMedia() + " e sua condição é " + condicao());
		
	}

	//Método de repetição
	public void laco(){
		
		//Continuar
		int continuar = 0;
		
		//Laço
		do{
			
			obterDados();
			informacoes();
			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
			
		}while(continuar == 0);
		
	}

}

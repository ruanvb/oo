package exercicio13;

import javax.swing.JOptionPane;

public class Numero {

	int numero = 0;
	int antecessor = 0;
	int resultado = 0;
	int conta = 0;
	int conta1 = 0;
	
	String exibir = "";
	
	public void obterNumero(){
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número"));
		
	}
	
	public void gerarCalculos(){
		
		do{
			
			antecessor = numero-1;
			conta = numero*antecessor;
			exibir += numero + " X " + antecessor + " = " + conta+"\n\n";
			
			do{
				antecessor = antecessor-1;
				conta1 = conta;
				conta = conta1*antecessor;
				exibir += conta1 + " X "+ antecessor + " = " + conta + "\n\n";
				
			}while(antecessor>1);
			
		}while(antecessor>1);
		
		JOptionPane.showMessageDialog(null, exibir);
	}
	
}

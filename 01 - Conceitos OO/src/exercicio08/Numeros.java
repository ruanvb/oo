package exercicio08;

import javax.swing.JOptionPane;

public class Numeros {

	int numero;
	int indice = 1;
	String numerosresultado;
	
	public void obterNumero(){
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para obter seus sucessores e antecessores."));
		
	}
	
	public void exibir(){
		
		 numerosresultado = "Números sucessores e antecessores de "+numero;
	        numerosresultado += "\nSucessores          Antecessores";
	        
	        while (indice<=10) {
	            numerosresultado += "\n"+(numero+indice)+"                ..................                "+(numero-indice);
	            indice++;
	        }
	        
	        JOptionPane.showMessageDialog(null, numerosresultado);
		
	}
	
}

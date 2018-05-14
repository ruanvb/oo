package exemplo01;

import javax.swing.JOptionPane;

public class Calculadora {

	//Estático -> Não precisa ser instanciado.
	
	//Método para somar
	public static void somar(int n1, int n2) {
		
		JOptionPane.showMessageDialog(null, "A soma é: "+(n1+n2));
		
	}
	
}

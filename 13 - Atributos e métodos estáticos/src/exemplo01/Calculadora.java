package exemplo01;

import javax.swing.JOptionPane;

public class Calculadora {

	//Est�tico -> N�o precisa ser instanciado.
	
	//M�todo para somar
	public static void somar(int n1, int n2) {
		
		JOptionPane.showMessageDialog(null, "A soma �: "+(n1+n2));
		
	}
	
}

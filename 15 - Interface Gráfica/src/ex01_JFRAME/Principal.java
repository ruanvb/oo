package ex01_JFRAME;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar um objeto da classe JFrame
		JFrame formulario = new JFrame();
		
		//Especificações do objeto 'formulario'
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Meu primeiro formulário");
		
	}

}

package ex03_TEXTFIELD;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar um objeto da classe JFRAME
		JFrame formulario = new JFrame();
		
		//Especificações do objeto formulário
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(380, 140);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setTitle("Trabalhando com campos de texto");
		
		//Rótulo
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(30, 30, 130, 20);
	
		//Campo
		JTextField campo = new JTextField();
		campo.setBounds(150, 30, 150, 20);
	
		//Adicionar componentes ao formulário
		formulario.add(rotulo);
		formulario.add(campo);
	
		//Exibir o formulário e seus componentes
		formulario.setVisible(true);
		
	}

}

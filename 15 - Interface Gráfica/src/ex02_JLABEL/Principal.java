package ex02_JLABEL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		// Instanciar um objeto da classe JFrame
		JFrame formulario = new JFrame();

		// Especificações do objeto 'formulario'
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setTitle("Trabalhando com rótulos");

		// Criando um rótulo
		JLabel rotulo = new JLabel();
		rotulo.setText("Uma mensagem qualquer...");
		rotulo.setBounds(20, 0, 300, 20);
		
		//Criando outro rótulo
		JLabel rotulo2 = new JLabel();
		rotulo2.setText("Outra mensagem qualquer...");
		rotulo2.setBounds(20, 30, 300, 20);
		
		JButton botao = new JButton();
		botao.setText("Confirmar");
		botao.setBounds(20, 200, 100, 40);
		
		JButton botao2 = new JButton();
		botao2.setText("Cancelar");
		botao2.setBounds(150, 200, 100, 40);
		
		//Adicionar componentes ao formulário
		formulario.add(rotulo);
		formulario.add(rotulo2);
		formulario.add(botao);
		formulario.add(botao2);
		
	}

}






















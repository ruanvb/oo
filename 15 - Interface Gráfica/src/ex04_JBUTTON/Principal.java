package ex04_JBUTTON;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Instanciar um objeto da classe JFRAME
		JFrame formulario = new JFrame();

		// Especifica��es do objeto formul�rio
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(350, 100);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setTitle("Trabalhando com bot�es");
		
		//Criando um bot�o
		JButton botao = new JButton();
		botao.setText("Clique em mim");
		botao.setBounds(20, 20, 290, 30);
		
		// Adicionando uma a��o ao bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Voc� clicou no bot�o");
				
			}
		});
		
		//Adicionar ao formul�rio
		formulario.add(botao);
		
		//Exibindo o formul�rio e componentes
		formulario.setVisible(true);
		
	}

}

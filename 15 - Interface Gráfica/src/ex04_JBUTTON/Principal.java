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

		// Especificações do objeto formulário
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(350, 100);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setTitle("Trabalhando com botões");
		
		//Criando um botão
		JButton botao = new JButton();
		botao.setText("Clique em mim");
		botao.setBounds(20, 20, 290, 30);
		
		// Adicionando uma ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "Você clicou no botão");
				
			}
		});
		
		//Adicionar ao formulário
		formulario.add(botao);
		
		//Exibindo o formulário e componentes
		formulario.setVisible(true);
		
	}

}

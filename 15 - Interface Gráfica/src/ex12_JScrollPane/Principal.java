package ex12_JScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {
		
		// JFrame
		JFrame formulario = new JFrame("JScrollPane");
		formulario.setSize(280, 110);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		// JTextArea
		JTextArea campoMensagem = new JTextArea("D� v�rios Enters para pular linha e gerar a barra de rolagem");
		
		// JScrollPane - Respons�vel pela barra de rolagem
		JScrollPane barra = new JScrollPane(campoMensagem);
		barra.setBounds(10, 10, 244, 50);
		
		// Adicionar o elemento barra de rolagem no formul�rio
		formulario.add(barra);
		
		//Exibir formul�rio
		formulario.setVisible(true);
		

	}

}
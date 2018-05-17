package Exer03;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Usuário");
		formulario.setSize(160, 235);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		
		// JLabels
		JLabel nota1 = new JLabel("Nota 1: ");
		nota1.setFont(new Font("SansSerif", Font.ITALIC, 14));
		nota1.setBounds(10, 10, 50, 20);
		
		JLabel nota2 = new JLabel("Nota 2: ");
		nota2.setFont(new Font("SansSerif", Font.ITALIC, 14));
		nota2.setBounds(10, 40, 50, 20);
		
		JLabel nota3 = new JLabel("Nota 3: ");
		nota3.setFont(new Font("SansSerif", Font.ITALIC, 14));
		nota3.setBounds(10, 70, 50, 20);
		
		JLabel nota4 = new JLabel("Nota 4: ");
		nota4.setFont(new Font("SansSerif", Font.ITALIC, 14));
		nota4.setBounds(10, 100, 50, 20);
		
		// JTextFields
		JTextField infnota1 = new JTextField();
		infnota1.setBounds(65, 10, 70, 20);
		
		JTextField infnota2 = new JTextField();
		infnota2.setBounds(65, 40, 70, 20);
		
		JTextField infnota3 = new JTextField();
		infnota3.setBounds(65, 70, 70, 20);
		
		JTextField infnota4 = new JTextField();
		infnota4.setBounds(65, 100, 70, 20);
		
		// JButton
		JButton botao = new JButton();
		botao.setText("Confirmar");
		botao.setFont(new Font("SansSerif", Font.ITALIC, 14));
		botao.setBounds(10, 140, 123, 40);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double nota1 = Double.parseDouble(infnota1.getText());
				double nota2 = Double.parseDouble(infnota2.getText());
				double nota3 = Double.parseDouble(infnota3.getText());
				double nota4 = Double.parseDouble(infnota4.getText());
				
				double media = (nota1 + nota2 + nota3 + nota4)/4;
				
				String mensagem = "";
				
				if(media<4.9){
					mensagem += "Sua média é: "+media+"\n";
					mensagem += "Você está reprovado.";
				}else if(media<6.9){
					mensagem += "Sua média é: "+media+"\n";
					mensagem += "Você está em exame.";
				}else{
					mensagem += "Sua média é: "+media+"\n";
					mensagem += "Você está aprovado.";
				}
				
				JOptionPane.showMessageDialog(null, mensagem);
				
			}
		});
		
		
		//Add
		formulario.add(nota1);
		formulario.add(nota2);
		formulario.add(nota3);
		formulario.add(nota4);
		formulario.add(infnota1);
		formulario.add(infnota2);
		formulario.add(infnota3);
		formulario.add(infnota4);
		formulario.add(botao);
		
		formulario.setVisible(true);
		
	}

}

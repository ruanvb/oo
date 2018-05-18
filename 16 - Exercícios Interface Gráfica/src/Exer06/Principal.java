package Exer06;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Igualdade");
		formulario.setSize(390, 180);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JTextFields
		JTextField n1 = new JTextField();
		n1.setBounds(90, 10, 150, 20);

		JTextField n2 = new JTextField();
		n2.setBounds(90, 40, 150, 20);

		// JLabels
		JLabel rotulon1 = new JLabel();
		rotulon1.setText("1º Número: ");
		rotulon1.setFont(new Font("SansSerif", Font.ITALIC, 14));
		rotulon1.setBounds(10, 10, 100, 20);

		JLabel rotulon2 = new JLabel();
		rotulon2.setText("2º Número: ");
		rotulon2.setFont(new Font("SansSerif", Font.ITALIC, 14));
		rotulon2.setBounds(10, 40, 100, 20);

		JLabel exibir = new JLabel();
		exibir.setFont(new Font("SansSerif", Font.ITALIC, 14));
		exibir.setBounds(10, 63, 400, 20);

		// JButton
		JButton botao = new JButton();
		botao.setBounds(139, 90, 100, 40);
		botao.setText("Confirmar");
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double soma = Double.parseDouble(n1.getText())+Double.parseDouble(n2.getText());
				double multiplicacao = Double.parseDouble(n1.getText())*Double.parseDouble(n2.getText());

				if(Double.parseDouble(n1.getText()) == Double.parseDouble(n2.getText())){
					exibir.setText("Numeros iguais. Resultado da soma: "+soma);
				}else{
					exibir.setText("Números diferentes. Resultado da multiplicação: "+multiplicacao);;
				}
				
			}
		});

		// Add
		formulario.add(n1);
		formulario.add(n2);
		formulario.add(rotulon1);
		formulario.add(rotulon2);
		formulario.add(exibir);
		formulario.add(botao);
		
		formulario.setVisible(true);

	}

}

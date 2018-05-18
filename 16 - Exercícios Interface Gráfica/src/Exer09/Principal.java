package Exer09;

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
		JFrame formulario = new JFrame("Menor número");
		formulario.setSize(280, 230);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JTextFields
		JTextField numero1 = new JTextField();
		numero1.setBounds(90, 10, 150, 20);

		JTextField numero2 = new JTextField();
		numero2.setBounds(90, 40, 150, 20);

		JTextField numero3 = new JTextField();
		numero3.setBounds(90, 70, 150, 20);

		// JLabels
		JLabel numero1view = new JLabel();
		numero1view.setText("1º Número: ");
		numero1view.setFont(new Font("SansSerif", Font.ITALIC, 14));
		numero1view.setBounds(10, 10, 80, 20);

		JLabel numero2view = new JLabel();
		numero2view.setText("2º Número: ");
		numero2view.setFont(new Font("SansSerif", Font.ITALIC, 14));
		numero2view.setBounds(10, 40, 80, 20);

		JLabel numero3view = new JLabel();
		numero3view.setText("3º Número: ");
		numero3view.setFont(new Font("SansSerif", Font.ITALIC, 14));
		numero3view.setBounds(10, 70, 80, 20);

		JLabel exibir = new JLabel();
		exibir.setFont(new Font("Arial", Font.ITALIC, 14));
		exibir.setBounds(10, 105, 200, 20);
		
		// JButton
		JButton botao = new JButton();
		botao.setBounds(140, 135, 100, 40);
		botao.setText("Confirmar");

		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double primeiro = Double.parseDouble(numero1.getText());
				double segundo = Double.parseDouble(numero2.getText());
				double terceiro = Double.parseDouble(numero3.getText());
				
				if((terceiro > segundo) && (segundo>primeiro)){
					exibir.setText("O menor número é o "+primeiro);
				}else if(terceiro>segundo){
					exibir.setText("O menor número é o "+segundo);
				}else if(terceiro<segundo){
					exibir.setText("O menor número é o "+terceiro);
				}
				
			}
		});;
		
		// Add
		formulario.add(numero1);
		formulario.add(numero2);
		formulario.add(numero3);
		formulario.add(numero1view);
		formulario.add(numero2view);
		formulario.add(numero3view);
		formulario.add(botao);
		formulario.add(exibir);

		// Visible
		formulario.setVisible(true);

	}

}

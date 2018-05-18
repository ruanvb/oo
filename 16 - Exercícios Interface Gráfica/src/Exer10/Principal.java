package Exer10;

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
		JFrame formulario = new JFrame("Economia");
		formulario.setSize(175, 320);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JTextFields
		JTextField numero1 = new JTextField();
		numero1.setBounds(65, 10, 80, 20);

		JTextField numero2 = new JTextField();
		numero2.setBounds(65, 40, 80, 20);

		JTextField numero3 = new JTextField();
		numero3.setBounds(65, 70, 80, 20);

		JTextField numero4 = new JTextField();
		numero4.setBounds(65, 100, 80, 20);

		JTextField numero5 = new JTextField();
		numero5.setBounds(65, 130, 80, 20);

		JTextField numero6 = new JTextField();
		numero6.setBounds(65, 160, 80, 20);
		
		
		// JLabels
		
		JLabel numero1view = new JLabel();
		numero1view.setText("R$0,01: ");
		numero1view.setFont(new Font("SansSerif", Font.ITALIC, 14));
		numero1view.setBounds(10, 10, 80, 20);

		JLabel numero2view = new JLabel();
		numero2view.setText("R$0,05: ");
		numero2view.setFont(new Font("SansSerif", Font.ITALIC, 14));
		numero2view.setBounds(10, 40, 80, 20);

		JLabel numero3view = new JLabel();
		numero3view.setText("R$0,10: ");
		numero3view.setFont(new Font("SansSerif", Font.ITALIC, 14));
		numero3view.setBounds(10, 70, 80, 20);
		
		JLabel numero4view = new JLabel();
		numero4view.setText("R$0,25: ");
		numero4view.setFont(new Font("SansSerif", Font.ITALIC, 14));
		numero4view.setBounds(10, 100, 80, 20);

		JLabel numero5view = new JLabel();
		numero5view.setText("R$0,50: ");
		numero5view.setFont(new Font("SansSerif", Font.ITALIC, 14));
		numero5view.setBounds(10, 130, 80, 20);

		JLabel numero6view = new JLabel();
		numero6view.setText("R$1,00: ");
		numero6view.setFont(new Font("SansSerif", Font.ITALIC, 14));
		numero6view.setBounds(10, 160, 80, 20);
		
		JLabel totalview = new JLabel();
		totalview.setFont(new Font("SansSerif", Font.ITALIC, 14));
		totalview.setBounds(10, 220, 105, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Exibir total");
		botao.setFont(new Font("SansSerif", Font.ITALIC, 14));
		botao.setBounds(10, 190, 135, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double c01 = Double.parseDouble(numero1.getText()) * 0.01;
				double c05 = Double.parseDouble(numero2.getText()) * 0.05;
				double c10 = Double.parseDouble(numero3.getText()) * 0.10;
				double c25 = Double.parseDouble(numero4.getText()) * 0.25;
				double c50 = Double.parseDouble(numero5.getText()) * 0.50;
				double c1 = Double.parseDouble(numero6.getText()) * 1;
				
				double total = c01 + c05 + c10 + c25 + c50 + c1;
				
				totalview.setText("Total: R$"+total);
				
			}
		});
		
		//ADD
		formulario.add(numero1);
		formulario.add(numero2);
		formulario.add(numero3);
		formulario.add(numero4);
		formulario.add(numero5);
		formulario.add(numero6);
		formulario.add(numero1view);
		formulario.add(numero2view);
		formulario.add(numero3view);
		formulario.add(numero4view);
		formulario.add(numero5view);
		formulario.add(numero6view);
		formulario.add(botao);
		formulario.add(totalview);
		
		//Visible
		formulario.setVisible(true);
		
		
	}

}

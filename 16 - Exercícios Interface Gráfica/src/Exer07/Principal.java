package Exer07;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Tabuada");
		formulario.setSize(235, 360);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JLabels
		JLabel rotuloNumero = new JLabel();
		rotuloNumero.setText("Informe um número");
		rotuloNumero.setFont(new Font("SansSerif", Font.ITALIC, 14));
		rotuloNumero.setBounds(10, 10, 250, 20);
		
		JLabel rotuloTabuada = new JLabel();
		rotuloTabuada.setFont(new Font("SansSerif", Font.BOLD, 14));
		rotuloTabuada.setBounds(10, 30, 235, 300);
		
		// JTextField
		JTextField numero = new JTextField();
		numero.setBounds(10, 40, 125, 20);
		
		// JButton
		JButton botao = new JButton();
		botao.setBounds(145, 14, 60, 45);
		botao.setText("OK");
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int numeroInt = Integer.parseInt(numero.getText());
				
				int op0 = (int) (numeroInt * 0);
				int op1 = (int) (numeroInt * 1);
				int op2 = numeroInt * 2;
				int op3 = numeroInt * 3;
				int op4 = numeroInt * 4;
				int op5 = numeroInt * 5;
				int op6 = numeroInt * 6;
				int op7 = numeroInt * 7;
				int op8 = numeroInt * 8;
				int op9 = numeroInt * 9;
				int op10 = numeroInt * 10;
				
				rotuloTabuada.setText("<html>Número informado: "+numeroInt +"<br/>"+
						numeroInt + " X 0 = " + op0 +"<br/>"+
						numeroInt + " X 1 = "  +op1 +"<br/>"+
						numeroInt + " X 2 = "  +op2 +"<br/>"+
						numeroInt + " X 3 = "  +op3 +"<br/>"+
						numeroInt + " X 4 = "  +op4 +"<br/>"+
						numeroInt + " X 5 = "  +op5 +"<br/>"+
						numeroInt + " X 6 = "  +op6 +"<br/>"+
						numeroInt + " X 7 = "  +op7 +"<br/>"+
						numeroInt + " X 8 = "  +op8 +"<br/>"+
						numeroInt + " X 9 = "  +op9 +"<br/>"+
						numeroInt + " X 10 = "  +op10 +"</html>");

				
			}
		});
		
		//Add
		formulario.add(rotuloNumero);
		formulario.add(rotuloTabuada);
		formulario.add(numero);
		formulario.add(botao);
		
		//Visible
		formulario.setVisible(true);
		
	}

}

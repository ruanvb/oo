package Exer08;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Calculadora");
		formulario.setSize(235, 360);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JLabels
		JLabel rotuloNumero1 = new JLabel();
		rotuloNumero1.setText("Informe um número");
		rotuloNumero1.setFont(new Font("SansSerif", Font.ITALIC, 14));
		rotuloNumero1.setBounds(10, 10, 250, 20);

		// JLabels
		JLabel rotuloNumero2 = new JLabel();
		rotuloNumero2.setText("Informe outro número");
		rotuloNumero2.setFont(new Font("SansSerif", Font.ITALIC, 14));
		rotuloNumero2.setBounds(10, 10, 250, 20);

		rotuloNumero2.setVisible(false);
		
		JLabel exibir = new JLabel();
		exibir.setFont(new Font("SansSerif", Font.BOLD, 14));
		exibir.setBounds(10, 180, 250, 20);

		// JTextFields
		JTextField numero1 = new JTextField();
		numero1.setBounds(10, 40, 125, 20);

		JTextField numero2 = new JTextField();
		numero2.setBounds(10, 40, 125, 20);

		numero2.setVisible(false);
		
		// JButtons
		
		//SOMA
		JRadioButton soma = new JRadioButton();
		soma.setText("+");
		soma.setActionCommand("s");
		soma.setBounds(10, 70, 50, 50);
		
		soma.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				numero1.setVisible(false);
				rotuloNumero1.setVisible(false);
				numero2.setVisible(true);
				rotuloNumero2.setVisible(true);
				
			}
		});
		
		
		//SUBTRACAO
		JRadioButton subtracao = new JRadioButton();
		subtracao.setText("-");
		subtracao.setActionCommand("su");
		subtracao.setBounds(10, 130, 50, 50);
		
		subtracao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				numero1.setVisible(false);
				rotuloNumero1.setVisible(false);
				numero2.setVisible(true);
				rotuloNumero2.setVisible(true);
				
			}
		});
		
		
		//DIVISAO
		JRadioButton divisao = new JRadioButton();
		divisao.setText("/");
		divisao.setActionCommand("d");
		divisao.setBounds(70, 70, 50, 50);
		
		
		divisao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				numero1.setVisible(false);
				rotuloNumero1.setVisible(false);
				numero2.setVisible(true);
				rotuloNumero2.setVisible(true);
				
			}
		});
		
		
		//MULTIPLICACAO
		JRadioButton multiplicacao = new JRadioButton();
		multiplicacao.setText("*");
		multiplicacao.setActionCommand("m");
		multiplicacao.setBounds(70, 130, 50, 50);
		
		multiplicacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				numero1.setVisible(false);
				rotuloNumero1.setVisible(false);
				numero2.setVisible(true);
				rotuloNumero2.setVisible(true);
				
				
			}
		});
		
		ButtonGroup operacao = new ButtonGroup();
		operacao.add(soma);
		operacao.add(subtracao);
		operacao.add(divisao);
		operacao.add(multiplicacao);
		
		// JButton
		JButton botao1 = new JButton();
		botao1.setBounds(145, 70, 60, 110);
		botao1.setText("=");
		
		botao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				numero1.setVisible(true);
				rotuloNumero1.setVisible(true);
				numero2.setVisible(false);
				rotuloNumero2.setVisible(false);
				
				int soma = Integer.parseInt(numero1.getText()) + Integer.parseInt(numero2.getText());
				int subtracao = Integer.parseInt(numero1.getText()) - Integer.parseInt(numero2.getText());
				double divisao = Double.parseDouble(numero1.getText()) / Double.parseDouble(numero2.getText());
				int multiplicacao = Integer.parseInt(numero1.getText()) * Integer.parseInt(numero2.getText());
				
				if(operacao.getSelection().getActionCommand().equals("s")){
					exibir.setText("Resultado: "+soma);
				}else if(operacao.getSelection().getActionCommand().equals("su")){
					exibir.setText("Resultado: "+subtracao);
				}else if(operacao.getSelection().getActionCommand().equals("d")){
					exibir.setText("Resultado: "+divisao);
				}else{
					exibir.setText("Resultado: "+multiplicacao);
				}
				
			}
		});
		
		
		//ADD
		formulario.add(rotuloNumero1);
		formulario.add(rotuloNumero2);
		formulario.add(numero1);
		formulario.add(numero2);
		formulario.add(soma);
		formulario.add(subtracao);
		formulario.add(divisao);
		formulario.add(multiplicacao);
		formulario.add(botao1);
		formulario.add(exibir);
		
		formulario.setVisible(true);
		
	}

}

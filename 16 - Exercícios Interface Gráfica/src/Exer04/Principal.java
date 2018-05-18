package Exer04;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Produto");
		formulario.setSize(250, 235);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		
		// JLabels
		JLabel rotuloNome = new JLabel();
		rotuloNome.setText("Nome: ");
		rotuloNome.setFont(new Font("SansSerif", Font.ITALIC, 14));
		rotuloNome.setBounds(10, 10, 50, 20);
		
		JLabel rotuloValor = new JLabel();
		rotuloValor.setText("Valor: ");
		rotuloValor.setFont(new Font("SansSerif", Font.ITALIC, 14));
		rotuloValor.setBounds(10, 40, 50, 20);
		
		// JTextFields
		JTextField nome = new JTextField();
		nome.setBounds(65, 10, 150, 20);

		JTextField valor = new JTextField();
		valor.setBounds(65, 40, 150, 20);
		
		// JRadioButton
		JRadioButton avista = new JRadioButton("À Vista");
		avista.setActionCommand("v");
		avista.setBounds(65, 75, 80, 20);
		
		JRadioButton aprazo = new JRadioButton("À Prazo");
		aprazo.setActionCommand("p");
		aprazo.setBounds(145, 75, 100, 20);
		
		// ButtonGroup
		ButtonGroup formas = new ButtonGroup();
		formas.add(avista);
		formas.add(aprazo);
		
		// JButton
		JButton botao = new JButton();
		botao.setBounds(112, 135, 100, 40);
		botao.setText("Confirmar");
		
		JLabel exibir = new JLabel();
		exibir.setFont(new Font("SansSerif", Font.ITALIC, 14));
		exibir.setBounds(10, 100, 400, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				double valordouble = Double.parseDouble(valor.getText());
				double valorDesconto = 0;
				
				String mensagem = "";
				
				if((valordouble>500) && formas.getSelection().getActionCommand().equals("v")){
					valorDesconto = valordouble*0.90;
					mensagem = "O produto "+nome.getText()+" custará R$"+valorDesconto;
					exibir.setText(mensagem);
					exibir.setVisible(true);
					
				}else{
					mensagem = "O produto "+nome.getText()+" custará R$"+valordouble;
					exibir.setText(mensagem);
					exibir.setVisible(true);
				}
				
			}
		});
		
		
		//Add
		formulario.add(rotuloNome);
		formulario.add(rotuloValor);
		formulario.add(nome);
		formulario.add(valor);
		formulario.add(avista);
		formulario.add(aprazo);
		formulario.add(exibir);
		formulario.add(botao);
		
		//Visible
		formulario.setVisible(true);
		
	}

}

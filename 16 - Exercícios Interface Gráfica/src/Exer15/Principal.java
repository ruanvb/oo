package Exer15;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Hotel");
		formulario.setSize(700, 450);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JLabels

		JLabel opcao = new JLabel();
		opcao.setText("Escolha a opção de apartamento desejada");
		opcao.setFont(new Font("SansSerif", Font.ITALIC, 18));
		opcao.setBounds(20, 20, 500, 30);

		JLabel dias = new JLabel();
		dias.setText("Quantos dias o cliente ficará hospedado?");
		dias.setFont(new Font("SansSerif", Font.ITALIC, 18));
		dias.setBounds(20, 120, 500, 30);

		JLabel exibir = new JLabel();
		exibir.setFont(new Font("SansSerif", Font.ITALIC, 16));
		exibir.setBounds(20, 230, 500, 200);

		// JTextFields

		JTextField infdias = new JTextField();
		infdias.setBounds(20, 160, 200, 30);

		// JRadioButtons
		JRadioButton simples = new JRadioButton();
		simples.setText("Apartamento Simples");
		simples.setActionCommand("s");
		simples.setBounds(20, 70, 180, 30);
		simples.setFont(new Font("SansSerif", Font.ITALIC, 15));

		JRadioButton duplo = new JRadioButton();
		duplo.setText("Apartamento Duplo");
		duplo.setActionCommand("d");
		duplo.setBounds(200, 70, 160, 30);
		duplo.setFont(new Font("SansSerif", Font.ITALIC, 15));

		JRadioButton luxo = new JRadioButton();
		luxo.setText("Suíte de Luxo");
		luxo.setActionCommand("l");
		luxo.setBounds(370, 70, 180, 30);
		luxo.setFont(new Font("SansSerif", Font.ITALIC, 15));

		ButtonGroup opcoes = new ButtonGroup();
		opcoes.add(simples);
		opcoes.add(duplo);
		opcoes.add(luxo);

		// JButtons

		JButton confirmar = new JButton();
		confirmar.setText("Confirmar hospedagem");
		confirmar.setFont(new Font("SansSerif", Font.ITALIC, 14));
		confirmar.setBounds(20, 210, 200, 30);

		confirmar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int totalSimples = Integer.parseInt(infdias.getText()) * 45;
				int totalDuplo = Integer.parseInt(infdias.getText()) * 65;
				int totalLuxo = Integer.parseInt(infdias.getText()) * 110;

				if (opcoes.getSelection().getActionCommand().equals("s")) {
					exibir.setText("<html>O cliente ficará hospedado: " + infdias.getText() + " dias "
							+ "<br/>O apartamento escolhido foi: Apartamento Simples" + "<br/>O valor total é: R$"
							+ totalSimples + "</html>");
				} else if (opcoes.getSelection().getActionCommand().equals("d")) {
					exibir.setText("<html>O cliente ficará hospedado: " + infdias.getText() + " dias "
							+ "<br/>O apartamento escolhido foi: Apartamento Duplo" + "<br/>O valor total é: R$"
							+ totalDuplo + "</html>");
				} else {
					exibir.setText("<html>O cliente ficará hospedado: " + infdias.getText() + " dias "
							+ "<br/>O apartamento escolhido foi: Súite de Luxo" + "<br/>O valor total é: R$" + totalLuxo
							+ "</html>");
				}

			}
		});

		formulario.add(opcao);
		formulario.add(simples);
		formulario.add(duplo);
		formulario.add(luxo);
		formulario.add(dias);
		formulario.add(infdias);
		formulario.add(confirmar);
		formulario.add(exibir);

		formulario.setVisible(true);

	}

}

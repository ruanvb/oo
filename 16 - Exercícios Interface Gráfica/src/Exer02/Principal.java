package Exer02;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Usuário");
		formulario.setSize(460, 200);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		
		// JLabel
		JLabel informe = new JLabel();
		informe.setText("Informe o valor do produto:    R$");
		informe.setFont(new Font("SansSerif", Font.ITALIC, 14));
		informe.setBounds(10, 20, 250, 20);
		
		// JTextField
		JTextField valor = new JTextField();
		valor.setBounds(220, 20, 200, 20);
		
		// JButton
		JButton botao = new JButton();
		botao.setText("Confirmar");
		botao.setBounds(10, 65, 100, 40);
		
		//JLabel
		JLabel exibir = new JLabel();
		exibir.setVisible(true);
		exibir.setFont(new Font("SansSerif", Font.ITALIC, 14));
		exibir.setBounds(10, 120, 400, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String mensagem = "";
				
				double desconto = Double.parseDouble(valor.getText());
				
				double valorfinal = desconto*0.90;
				
				mensagem += "O valor do produto com um desconto de 10% é:  R$"+valorfinal;
			//	JOptionPane.showMessageDialog(null, mensagem);
				
				exibir.setText(mensagem);

				
			}
		});
		
		//Adicionar
		formulario.add(informe);
		formulario.add(valor);
		formulario.add(botao);
		formulario.add(exibir);
		
		formulario.setVisible(true);

	}

}

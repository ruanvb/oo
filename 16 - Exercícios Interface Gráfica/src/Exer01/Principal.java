package Exer01;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Usuário");
		formulario.setSize(300, 260);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JLabel
		JLabel rotuloNome = new JLabel("Nome");
		rotuloNome.setBounds(10, 20, 50, 20);
		rotuloNome.setFont(new Font("SansSerif", Font.ITALIC, 12));

		JLabel rotuloCidade = new JLabel("Cidade");
		rotuloCidade.setBounds(10, 60, 50, 20);
		rotuloCidade.setFont(new Font("SansSerif", Font.ITALIC, 12));
		
		JLabel rotuloIdade = new JLabel("Idade");
		rotuloIdade.setBounds(10, 100, 50, 20);
		rotuloIdade.setFont(new Font("SansSerif", Font.ITALIC, 12));
		
		// JTextField
		JTextField inome = new JTextField();
		inome.setBounds(60, 20, 200, 20);

		JTextField icidade = new JTextField();
		icidade.setBounds(60, 60, 200, 20);

		JTextField iidade = new JTextField();
		iidade.setBounds(60, 100, 200, 20);

		JButton botao = new JButton("Verificar");
		botao.setFont(new Font("SansSerif", Font.ITALIC, 12));
		botao.setBounds(160, 150, 100, 40);

		
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nome = inome.getText();
				String cidade = icidade.getText();
				String idade = iidade.getText();
				
				String mensagem = "";

				mensagem += "Olá " +nome+", você tem " + idade + " anos e mora em "+cidade+".";

				JOptionPane.showMessageDialog(null, mensagem);
				
			}
		});

		formulario.add(rotuloNome);
		formulario.add(rotuloCidade);
		formulario.add(rotuloIdade);
		formulario.add(inome);
		formulario.add(icidade);
		formulario.add(iidade);
		formulario.add(botao);

		formulario.setVisible(true);
	}

}

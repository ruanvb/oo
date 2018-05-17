package ex05_JCOMBOBOX;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Utilizando JComboBox");
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(30, 30, 300, 20);
		combo.addItem("Selecione uma op��o");
		combo.addItem("Domingo");
		combo.addItem("Segunda-Feira");
		combo.addItem("Ter�a-Feira");
		combo.addItem("Quarta-Feira");
		combo.addItem("Quinta-Feira");
		combo.addItem("Sexta-Feira");
		combo.addItem("S�bado");
		
		// A��o
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				JOptionPane.showMessageDialog(null, "O valor do combo �: "+combo.getSelectedItem());
				JOptionPane.showMessageDialog(null, "O �ndice do combo �: "+combo.getSelectedIndex());
				
			}
		});

		
		// Adicionando elementos ao JFrame
		formulario.add(combo);
		
		//Exibindo o formul�rio
		formulario.setVisible(true);

	}

}

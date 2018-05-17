package ex06_JCHECKBOX;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Utilizando JCheckBox");
		formulario.setSize(700, 230);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		
		// JCheckBox
		JCheckBox turnoMatutino = new JCheckBox("Matutino");
		turnoMatutino.setBounds(10, 10, 100, 20);
		
		JCheckBox turnoVespertino = new JCheckBox("Vespertino");
		turnoVespertino.setBounds(10, 40, 100, 20);
		
		JCheckBox turnoNoturno = new JCheckBox("Noturno");
		turnoNoturno.setBounds(10, 70, 100, 20);
		
		// JLabel
		JLabel exibir = new JLabel();
		exibir.setBounds(10, 140, 700, 30);
		exibir.setFont(new Font("Arial", Font.BOLD, 20));
		exibir.setForeground(Color.RED);
		
		// JButton
		JButton btn = new JButton("Verificar");
		btn.setBounds(10, 110, 100, 20);
		
		// Ação do botão
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int contador = 0;
				
				//Mensagem
				String mensagem = "Foram selecionados os turnos: \n\n";
				
				if(turnoMatutino.isSelected()){
					mensagem += "Matutino ";
					contador++;
				}
				
				if(turnoVespertino.isSelected()){
					mensagem += "Vespertino ";
					contador++;
				}
				
				if(turnoNoturno.isSelected()){
					mensagem += "Noturno ";
					contador++;
				}
				
				//Exibir mensagem
				if(contador == 0){
					exibir.setText("Nenhum turno selecionado");
				}else{
					exibir.setText(mensagem);
				}
				
			}
		});
		
		//Adicionar componentes ao JFrame
		formulario.add(turnoMatutino);
		formulario.add(turnoVespertino);
		formulario.add(turnoNoturno);	
		formulario.add(btn);
		formulario.add(exibir);
	
		//Exibir formulário
		formulario.setVisible(true);
		
	}

}

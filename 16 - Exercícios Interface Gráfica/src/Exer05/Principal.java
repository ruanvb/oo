package Exer05;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Fevereiro");
		formulario.setSize(250, 180);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JLabels
		JLabel dia = new JLabel();
		dia.setText("Dia: ");
		dia.setFont(new Font("SansSerif", Font.ITALIC, 14));
		dia.setBounds(10, 10, 50, 20);
		
		JLabel exibir = new JLabel();
		exibir.setFont(new Font("SansSerif", Font.ITALIC, 14));;
		exibir.setBounds(10, 40, 250, 20);
		
		// JTextFields
		JTextField infdia = new JTextField();
		infdia.setBounds(65, 10, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setBounds(112, 80, 100, 40);
		botao.setText("Confirmar");
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double semana = Integer.parseInt(infdia.getText());
				
				if((semana >=1) && (semana <=2) || (semana  >=5) && (semana <=9) || (semana >=12) && (semana <=16) || (semana >=19) && (semana<=23) || (semana >=26) && (semana <=28))  {
					exibir.setText("O dia: "+infdia.getText()+" é um dia de semana");
				}else if((semana == 3) || (semana == 4) || (semana == 10) || (semana == 11) || (semana == 17) || (semana == 18) || (semana == 24) || (semana == 25)){
					exibir.setText("O dia: "+infdia.getText()+" é um final de semana");
				}else if(semana >=29){
					exibir.setText("Data inválida.");
				}else if(semana <=0){
					exibir.setText("Data inválida");
				}
				
			}
		});

		formulario.add(dia);
		formulario.add(exibir);
		formulario.add(infdia);
		formulario.add(botao);
		
		formulario.setVisible(true);
		
	}

}

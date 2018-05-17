package ex07_JRADIOBUTTON;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Utilizando JComboBox");
		formulario.setSize(350, 230);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JRadioButton
		JRadioButton turnoMatutino = new JRadioButton("Matutino");
		turnoMatutino.setBounds(10, 10, 100, 20);
		turnoMatutino.setActionCommand("Matutino");

		JRadioButton turnoVespertino = new JRadioButton("Vespertino");
		turnoVespertino.setBounds(10, 40, 100, 20);
		turnoVespertino.setActionCommand("Vespertino");

		JRadioButton turnoNoturno = new JRadioButton("Noturno");
		turnoNoturno.setBounds(10, 70, 100, 20);
		turnoNoturno.setActionCommand("Noturno");

		// ButtonGroup
		ButtonGroup turnos = new ButtonGroup();
		turnos.add(turnoMatutino);
		turnos.add(turnoVespertino);
		turnos.add(turnoNoturno);

		// JButton
		JButton botao = new JButton("Verificar turno");
		botao.setBounds(10, 110, 150, 20);
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, turnos.getSelection().getActionCommand());

			}
		});

		// Adicionar componentes ao JFrame
		formulario.add(turnoMatutino);
		formulario.add(turnoVespertino);
		formulario.add(turnoNoturno);
		formulario.add(botao);

		// Exibir formulário
		formulario.setVisible(true);

	}

}

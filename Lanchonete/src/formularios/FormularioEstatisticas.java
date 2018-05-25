package formularios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controladores.Acao;

public class FormularioEstatisticas {

	public FormularioEstatisticas() {

		// JFrame
		JFrame formularioEstatisticas = new JFrame("Estatísticas");
		formularioEstatisticas.setSize(537, 480);
		formularioEstatisticas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularioEstatisticas.setLayout(null);
		formularioEstatisticas.setLocationRelativeTo(null);

		// JLabel
		JLabel rotuloPedidos = new JLabel();
		rotuloPedidos.setText("Estatísticas");
		rotuloPedidos.setFont(new Font("SansSerif", Font.PLAIN, 16));
		rotuloPedidos.setBounds(20, 20, 100, 20);

		// Tabela
		Acao ac = new Acao();
		JTable tabela = new JTable(ac.exibirPedidos());
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(20, 50, 480, 300);
		tabela.setAutoCreateRowSorter(true);
		
		// JButton
		JButton botaoSair = new JButton();
		botaoSair.setText("Voltar");
		botaoSair.setBounds(400, 370, 100, 50);

		botaoSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				formularioEstatisticas.dispose();

				FormularioPrincipal fp = new FormularioPrincipal();

			}
		});

		formularioEstatisticas.add(barraRolagem);
		formularioEstatisticas.add(rotuloPedidos);
		formularioEstatisticas.add(botaoSair);

		formularioEstatisticas.setVisible(true);

	}

}

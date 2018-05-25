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

public class FormularioHistorico {

	public FormularioHistorico() {

		// JFrame
		JFrame formularioHistorico = new JFrame("Histórico de Pedidos");
		formularioHistorico.setSize(537, 480);
		formularioHistorico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularioHistorico.setLayout(null);
		formularioHistorico.setLocationRelativeTo(null);

		// JLabel
		JLabel rotuloPedidos = new JLabel();
		rotuloPedidos.setText("Pedidos");
		rotuloPedidos.setFont(new Font("SansSerif", Font.PLAIN, 16));
		rotuloPedidos.setBounds(20, 20, 100, 20);

		// Tabela
		Acao ac = new Acao();
		JTable tabela = new JTable(ac.exibirPedidos());
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(20, 50, 480, 300);

		// JButton
		JButton botaoSair = new JButton();
		botaoSair.setText("Voltar");
		botaoSair.setBounds(400, 370, 100, 50);
		
		botaoSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				formularioHistorico.dispose();

				FormularioPrincipal fp = new FormularioPrincipal();

			}
		});

		formularioHistorico.add(barraRolagem);
		formularioHistorico.add(rotuloPedidos);
		formularioHistorico.add(botaoSair);

		formularioHistorico.setVisible(true);

	}

}

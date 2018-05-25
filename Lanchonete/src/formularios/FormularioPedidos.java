package formularios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controladores.Acao;

public class FormularioPedidos {

	public FormularioPedidos() {

		// JFrame
		JFrame formularioPedidos = new JFrame("Realizar Pedidos");
		formularioPedidos.setSize(380, 560);
		formularioPedidos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularioPedidos.setLayout(null);
		formularioPedidos.setLocationRelativeTo(null);

		// JLabel Cliente
		JLabel rotuloCliente = new JLabel();
		rotuloCliente.setText("Cliente");
		rotuloCliente.setBounds(30, 30, 90, 20);
		rotuloCliente.setFont(new Font("SansSerif", Font.ITALIC, 16));

		// JTextField Cliente
		JTextField clienteC = new JTextField();
		clienteC.setBounds(130, 30, 200, 20);

		// JLabel Quantidade
		JLabel rotuloQuantidade = new JLabel();
		rotuloQuantidade.setText("Quantidade");
		rotuloQuantidade.setBounds(30, 70, 90, 20);
		rotuloQuantidade.setFont(new Font("SansSerif", Font.ITALIC, 16));

		// JTextField Quantidade
		JTextField quantidadeP = new JTextField();
		quantidadeP.setBounds(130, 70, 200, 20);

		Acao ac = new Acao();
		JTable tabela = new JTable(ac.exibirProdutos());
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(30, 190, 300, 250);

		// JButton
		JButton botao = new JButton();
		botao.setBounds(130, 110, 200, 40);
		botao.setText("Realizar");

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Cliente
				String cliente = clienteC.getText();

				// Linha
				int linha = tabela.getSelectedRow();
				String produto = (String) tabela.getValueAt(linha, 0);

				// Data
				LocalDateTime tempo = LocalDateTime.now();
				int dia = tempo.getDayOfMonth();
				int mes = tempo.getMonthValue();
				int ano = tempo.getYear();
				
				int minuto = tempo.getMinute();
				int hora = tempo.getHour();

				String horaConsumo = dia + "/" +"0"+ mes + "/" + ano + " - " + hora+":"+"0"+minuto;

				if(minuto>10){
					
					horaConsumo = dia + "/" +"0"+ mes + "/" + ano + " - " + hora+":"+minuto;
					
				}
				
				if(mes>10){
					
					horaConsumo = dia + "/" + mes + "/" + ano + " - " + hora+":"+minuto+"0";
					
				}
				
				int quantidade = Integer.parseInt(quantidadeP.getText());

				ac.realizarPedido(cliente, produto, horaConsumo, quantidade);

				tabela.setModel(ac.exibirProdutos());

				clienteC.setText("");
				quantidadeP.setText("");

				clienteC.requestFocus();

			}
		});

		JButton botaoSair = new JButton();
		botaoSair.setBounds(130, 460, 200, 40);
		botaoSair.setText("Finalizar Pedidos");

		botaoSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				formularioPedidos.dispose();

				FormularioPrincipal fp = new FormularioPrincipal();

			}
		});

		formularioPedidos.add(rotuloCliente);
		formularioPedidos.add(clienteC);
		formularioPedidos.add(barraRolagem);
		formularioPedidos.add(rotuloQuantidade);
		formularioPedidos.add(quantidadeP);
		formularioPedidos.add(botao);
		formularioPedidos.add(botaoSair);

		formularioPedidos.setVisible(true);

	}

}

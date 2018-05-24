package formularios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controladores.Acao;

public class FormularioPrincipal {

	public FormularioPrincipal() {

		// JFrame
		JFrame formulario = new JFrame("Formulário");
		formulario.setSize(380, 560);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		// JLabel Produto
		JLabel rotuloProduto = new JLabel();
		rotuloProduto.setText("Produto");
		rotuloProduto.setBounds(30, 30, 90, 20);
		rotuloProduto.setFont(new Font("SansSerif", Font.ITALIC, 16));

		// JLabel Valor
		JLabel rotuloValor = new JLabel();
		rotuloValor.setText("Valor");
		rotuloValor.setBounds(30, 60, 90, 20);
		rotuloValor.setFont(new Font("SansSerif", Font.ITALIC, 16));

		// JLabel Quantidade
		JLabel rotuloQuantidade = new JLabel();
		rotuloQuantidade.setText("Quantidade");
		rotuloQuantidade.setBounds(30, 90, 90, 20);
		rotuloQuantidade.setFont(new Font("SansSerif", Font.ITALIC, 16));

		// JTextField Valor
		JTextField valor = new JTextField();
		valor.setBounds(130, 60, 200, 20);

		// JTextField quantidade
		JTextField quantidade = new JTextField();
		quantidade.setBounds(130, 90, 200, 20);

		// JTextField Produto
		JTextField produto = new JTextField();
		produto.setBounds(130, 30, 200, 20);

		// JButton
		JButton botao = new JButton();
		botao.setBounds(130, 130, 200, 40);
		botao.setText("Cadastrar");

		Acao ac = new Acao();
		
		JTable tabela = new JTable(ac.listarProdutos());
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(30, 190, 300, 300);

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nomeProduto = produto.getText();
				double valorProduto = Double.parseDouble(valor.getText());
				int quantidadeProduto = Integer.parseInt(quantidade.getText());

				ac.cadastrar(nomeProduto, valorProduto, quantidadeProduto);

				tabela.setModel(ac.listarProdutos());
				
				produto.setText("");
				valor.setText("");
				quantidade.setText("");

				produto.requestFocus();

			}
		});

		tabela.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {

				// Obter a linha
				int linha = tabela.getSelectedRow();

				// Obter os dados
				String nomeProduto = tabela.getValueAt(linha, 0).toString();
				double valorProduto = Double.parseDouble(tabela.getValueAt(linha, 1).toString());
				int quantidadeProduto = Integer.parseInt(tabela.getValueAt(linha, 2).toString());

				// Criar o novo formulário
				FormularioAlteracao f = new FormularioAlteracao(nomeProduto, valorProduto, quantidadeProduto, linha);

				// Fechar o FormulárioPrincipal
				formulario.dispose();

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// Add
		formulario.add(rotuloProduto);
		formulario.add(rotuloValor);
		formulario.add(rotuloQuantidade);
		formulario.add(produto);
		formulario.add(valor);
		formulario.add(quantidade);
		formulario.add(barraRolagem);
		formulario.add(botao);

		formulario.setVisible(true);

	}

}

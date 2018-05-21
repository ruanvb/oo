package formularios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controladores.Acao;
import controladores.Produto;

public class FormularioPrincipal {

	// JLabel Produto
	JLabel rotuloProduto = new JLabel();

	// JTextField Produto
	JTextField produto = new JTextField();

	// JLabel Valor
	JLabel rotuloValor = new JLabel();

	// JLabel Quantidade
	JLabel rotuloQuantidade = new JLabel();

	// JTextField Valor
	JTextField valor = new JTextField();

	// JTextField quantidade
	JTextField quantidade = new JTextField();

	// JTable exibir
	public static DefaultTableModel exibirProdutos = new DefaultTableModel();

	JTable tabela = new JTable(exibirProdutos);

	JScrollPane barraRolagem = new JScrollPane(tabela);

	// JFrame
	public JFrame formulario = new JFrame("Formulário");

	public void formularioJFrame() {

		formulario.setSize(300, 450);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);

		FormularioPrincipal fp = new FormularioPrincipal();
		fp.Produto();

		rotuloProduto.setText("Produto");
		rotuloProduto.setBounds(30, 30, 50, 20);
		rotuloProduto.setFont(new Font("SansSerif", Font.ITALIC, 14));

		// Add
		formulario.add(this.rotuloProduto);
		formulario.add(this.rotuloValor);
		formulario.add(this.rotuloQuantidade);
		formulario.add(this.produto);
		formulario.add(this.valor);
		formulario.add(this.quantidade);
		formulario.add(this.barraRolagem);

		formulario.setVisible(true);

	}

	public String Produto() {

		return produto.getText();

	}

	public String Valor() {

		return valor.getText();

	}

	public String Quantidade() {

		return quantidade.getText();

	}

	public void cadastroo() {

		// JButton Cadastrar
		JButton botaoCadastrar = new JButton();
		botaoCadastrar.setText("Cadastrar");
		botaoCadastrar.setFont(new Font("SansSerif", Font.PLAIN, 14));
		botaoCadastrar.setBounds(80, 130, 120, 40);
		
		formulario.add(botaoCadastrar);
		
		botaoCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				botaoCadastrar.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						exibirProdutos.addRow(new Object[] { Produto(), "R$" + Valor(), Quantidade() });

					}
				});

			}

		});

	}

	public void Formulario() {

		rotuloValor.setText("Valor");
		rotuloValor.setBounds(30, 60, 50, 20);
		rotuloValor.setFont(new Font("SansSerif", Font.ITALIC, 14));

		rotuloQuantidade.setText("Quantidade");
		rotuloQuantidade.setBounds(30, 90, 90, 20);
		rotuloQuantidade.setFont(new Font("SansSerif", Font.ITALIC, 14));

		valor.setBounds(120, 60, 140, 20);

		quantidade.setBounds(120, 90, 140, 20);

		produto.setBounds(120, 30, 140, 20);

		exibirProdutos.addColumn("Produto");
		exibirProdutos.addColumn("Valor");
		exibirProdutos.addColumn("Quantidade");

		barraRolagem.setBounds(30, 190, 240, 100);

	}

}

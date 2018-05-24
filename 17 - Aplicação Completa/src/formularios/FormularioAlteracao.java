package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controladores.Acao;

public class FormularioAlteracao {

	// Construtor
	public FormularioAlteracao(String nomeProduto, double valorProduto, int quantidadeProduto, int linha) {

		// JFrame
		JFrame formulario = new JFrame("Alterar produto");
		formulario.setSize(500, 200);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Componentes para realizar o cadastro
		JLabel rotuloNomeProduto = new JLabel("Nome do produto:");
		JLabel rotuloValorProduto = new JLabel("Valor do produto:");
		JLabel rotuloQuantidadeProduto = new JLabel("Quantidade do produto:");
		JTextField txtNomeProduto = new JTextField(nomeProduto);
		JTextField txtValorProduto = new JTextField(String.valueOf(valorProduto));
		JTextField txtQuantidadeProduto = new JTextField(String.valueOf(quantidadeProduto));

		rotuloNomeProduto.setBounds(80, 10, 120, 20);
		rotuloValorProduto.setBounds(80, 40, 120, 20);
		rotuloQuantidadeProduto.setBounds(80, 70, 150, 20);
		txtNomeProduto.setBounds(220, 10, 200, 20);
		txtValorProduto.setBounds(220, 40, 200, 20);
		txtQuantidadeProduto.setBounds(220, 70, 200, 20);

		// JButton
		JButton btnAlterar = new JButton("Alterar Produto");
		JButton btnExcluir = new JButton("Excluir Produto");
		JButton btnCancelar = new JButton("Cancelar");

		btnAlterar.setBounds(20, 130, 140, 20);
		btnExcluir.setBounds(170, 130, 140, 20);
		btnCancelar.setBounds(320, 130, 140, 20);

		// A��es - Alterar
		btnAlterar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Obter os dados
				String nomeProduto = txtNomeProduto.getText();
				double valorProduto = Double.parseDouble(txtValorProduto.getText());
				int quantidadeProduto = Integer.parseInt(txtQuantidadeProduto.getText());

				// Executar a a��o para alterar
				Acao a = new Acao();
				a.alterar(nomeProduto, valorProduto, quantidadeProduto, linha);

				// Fechar formul�rio atual
				formulario.dispose();

				// Chamar o formul�rio principal
				FormularioPrincipal fp = new FormularioPrincipal();

			}
		});

		// A��es - Excluir
		btnExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// M�todo para executar a exclus�o
				Acao a = new Acao();
				a.excluir(linha);

				// Fechar formul�rio atual
				formulario.dispose();

				// Chamar o formul�rio principal
				FormularioPrincipal fp = new FormularioPrincipal();

			}

		});

		// A��es - Cancelar
		btnCancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Fechar formul�rio atual
				formulario.dispose();

				// Chamar o formul�rio principal
				FormularioPrincipal fp = new FormularioPrincipal();

			}
		});

		// Adicionar elemenetos ao JFrame
		formulario.add(rotuloNomeProduto);
		formulario.add(rotuloValorProduto);
		formulario.add(rotuloQuantidadeProduto);
		formulario.add(txtNomeProduto);
		formulario.add(txtValorProduto);
		formulario.add(txtQuantidadeProduto);
		formulario.add(btnAlterar);
		formulario.add(btnExcluir);
		formulario.add(btnCancelar);

		// Exibir Estrutura
		formulario.setVisible(true);

	}

}
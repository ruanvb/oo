package formularios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controladores.Acao;

public class FormularioCadastrar {

	public FormularioCadastrar() {

		// JFrame
		JFrame formularioCadastrar = new JFrame("Cadastrar Produtos");
		formularioCadastrar.setSize(380, 560);
		formularioCadastrar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularioCadastrar.setLayout(null);
		formularioCadastrar.setLocationRelativeTo(null);

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

		// JTextField Valor
		JTextField valor = new JTextField();
		valor.setBounds(130, 60, 200, 20);

		// JTextField Produto
		JTextField produto = new JTextField();
		produto.setBounds(130, 30, 200, 20);

		// JButton
		JButton botao = new JButton();
		botao.setBounds(130, 110, 200, 40);
		botao.setText("Cadastrar");
		
		JButton botaoSair = new JButton();
		botaoSair.setBounds(130, 460, 200, 40);
		botaoSair.setText("Finalizar Cadastros");
		
		Acao ac = new Acao();
		JTable tabela = new JTable(ac.exibirProdutos());
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(30, 190, 300, 250);

		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				formularioCadastrar.dispose();
				
				FormularioPrincipal fp = new FormularioPrincipal();
				
			}
		});
		
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nomeProduto = produto.getText();
				double valorProduto = Double.parseDouble(valor.getText());

				ac.cadastrar(nomeProduto, valorProduto);

				tabela.setModel(ac.exibirProdutos());

				produto.setText("");
				valor.setText("");

				produto.requestFocus();

			}
		});

		formularioCadastrar.add(rotuloProduto);
		formularioCadastrar.add(rotuloValor);
		formularioCadastrar.add(valor);
		formularioCadastrar.add(produto);
		formularioCadastrar.add(botao);
		formularioCadastrar.add(barraRolagem);
		formularioCadastrar.add(botaoSair);

		formularioCadastrar.setVisible(true);

	}

}

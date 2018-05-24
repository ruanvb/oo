package controladores;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import formularios.FormularioPrincipal;

public class Acao {

	
	public void cadastrar(String nomeProduto, double valorProduto, int quantidadeProduto) {

		Produto p = new Produto();
		
		p.setNome(nomeProduto);
		p.setValor(valorProduto);
		p.setQuantidade(quantidadeProduto);

		Produto.dados.add(p);

	}

	public DefaultTableModel listarProdutos() {

		// DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Valor");
		modelo.addColumn("Quantidade");

		for (int indice = 0; indice < Produto.dados.size(); indice++) {
			modelo.addRow(new Object[] { Produto.dados.get(indice).getNome(),
					Produto.dados.get(indice).getValor(), Produto.dados.get(indice).getQuantidade() });

		}

		// Retorno
		return modelo;

	}

	public void excluir(int linha) {
		Produto.dados.remove(linha);
	}

	public void alterar(String nomeProduto, double valorProduto, int quantidadeProduto, int linha) {

		// Criar objeto
		Produto p = new Produto();
		p.setNome(nomeProduto);
		p.setValor(valorProduto);
		p.setQuantidade(quantidadeProduto);

		// Realizar a alteração
		Produto.dados.set(linha, p);

	}

}

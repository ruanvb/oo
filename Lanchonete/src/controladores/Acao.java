package controladores;

import javax.swing.table.DefaultTableModel;

public class Acao {

	public void cadastrar(String nomeProduto, double valorProduto) {

		Produtos p = new Produtos();

		p.setNomeProduto(nomeProduto);
		p.setValorProduto(valorProduto);

		Produtos.dados.add(p);

	}

	public DefaultTableModel exibirProdutos() {

		// DefaultTableModel
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Produto");
		modelo.addColumn("Valor");

		for (int indice = 0; indice < Produtos.dados.size(); indice++) {
			modelo.addRow(new Object[] { Produtos.dados.get(indice).getNomeProduto(),
					Produtos.dados.get(indice).getValorProduto() });

		}

		// Retorno
		return modelo;

	}

	public void realizarPedido(String cliente, String produto, String horaConsumo, int quantidade) {

		Pedidos p = new Pedidos();

		p.setCliente(cliente);
		p.setHoraConsumo(horaConsumo);
		p.setProduto(produto);
		p.setQuantidade(quantidade);

		Pedidos.pedidos.add(p);

	}

	public DefaultTableModel exibirPedidos() {
		
		// DefaultTableModel
		DefaultTableModel modeloPedidos = new DefaultTableModel();
		modeloPedidos.addColumn("Cliente");
		modeloPedidos.addColumn("Data e Hora");
		modeloPedidos.addColumn("Produtos");
		modeloPedidos.addColumn("Quantidade");
		
		
		for (int indice = 0; indice < Pedidos.pedidos.size(); indice++) {
			modeloPedidos.addRow(new Object[] { Pedidos.pedidos.get(indice).getCliente(),
					Pedidos.pedidos.get(indice).getHoraConsumo(), Pedidos.pedidos.get(indice).getProduto(),
					Pedidos.pedidos.get(indice).getQuantidade() });

		}

		// Retorno
		return modeloPedidos;

	}

}

package formularios;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controladores.Acao;

public class FormularioHistorico {

	public FormularioHistorico() {

		// JFrame
		JFrame formularioHistorico = new JFrame("Cadastrar Produtos");
		formularioHistorico.setSize(537, 420);
		formularioHistorico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularioHistorico.setLayout(null);
		formularioHistorico.setLocationRelativeTo(null);

		// JLabel
		JLabel rotuloPedidos = new JLabel();
		rotuloPedidos.setText("Pedidos");
		rotuloPedidos.setFont(new Font("SansSerif", Font.PLAIN, 16));
		rotuloPedidos.setBounds(20, 20, 100, 20);
		
		//Tabela
		Acao ac = new Acao();
		JTable tabela = new JTable(ac.exibirPedidos());
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(20, 50, 480, 300);

		formularioHistorico.add(barraRolagem);
		formularioHistorico.add(rotuloPedidos);

		formularioHistorico.setVisible(true);
		
	}

}

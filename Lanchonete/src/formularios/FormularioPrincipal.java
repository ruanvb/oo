package formularios;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import controladores.Acao;

public class FormularioPrincipal {

	public FormularioPrincipal() {

		//JFrame
		JFrame formulario = new JFrame();
		formulario.setSize(440, 535);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		
		JButton botaoCadastrar = new JButton();
		botaoCadastrar.setText("Cadastrar Produto");
		botaoCadastrar.setFont(new Font("SansSerif", Font.PLAIN, 15));
		botaoCadastrar.setBounds(110, 40, 220, 50);
		
		JButton botaoPedidos = new JButton();
		botaoPedidos.setText("Realizar Pedido");
		botaoPedidos.setFont(new Font("SansSerif", Font.PLAIN, 17));
		botaoPedidos.setBounds(110, 130, 220, 50);
		
		JButton botaoHistorico = new JButton();
		botaoHistorico.setText("Exibir Histórico");
		botaoHistorico.setFont(new Font("SansSerif", Font.PLAIN, 17));
		botaoHistorico.setBounds(110, 220, 220, 50);
		
		JButton botaoEstatisticas = new JButton();
		botaoEstatisticas.setText("Estatísticas");
		botaoEstatisticas.setFont(new Font("SansSerif", Font.PLAIN, 17));
		botaoEstatisticas.setBounds(110, 310, 220, 50);
		
		JButton botaoSair = new JButton();
		botaoSair.setText("Sair");
		botaoSair.setBounds(165, 400, 100, 55);
		
		Acao a = new Acao();
		
		botaoCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				FormularioCadastrar fc = new FormularioCadastrar();
				
				formulario.dispose();
				
			}
		});
		
		botaoPedidos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FormularioPedidos fp = new FormularioPedidos();
				
				formulario.dispose();
				
			}
		});
		
		botaoSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				formulario.dispose();
				
			}
		});
		
		botaoHistorico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				FormularioHistorico fh = new FormularioHistorico();
				
				formulario.dispose();
				
			}
		});
		
		formulario.add(botaoPedidos);
		formulario.add(botaoCadastrar);
		formulario.add(botaoHistorico);
		formulario.add(botaoEstatisticas);
		formulario.add(botaoSair);
		
		formulario.setVisible(true);
		
	}

}

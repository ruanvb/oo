package controladores;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import formularios.FormularioPrincipal;

public class Acao {

	FormularioPrincipal formu = new FormularioPrincipal();
	Produto product = new Produto();

	public void cadastrar() {

		product.nome = formu.Produto();
		product.valor = Double.parseDouble(formu.Valor());
		product.quantidade = Integer.parseInt(formu.Quantidade());

		Produto.dados.add(product);
		
	}
	

}

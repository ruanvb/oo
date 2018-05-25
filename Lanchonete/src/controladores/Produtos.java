package controladores;

import java.util.ArrayList;

public class Produtos {

	String nomeProduto;
	double valorProduto;
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public static ArrayList<Produtos> dados = new ArrayList<>();
	
	
	
}

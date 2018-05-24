package controladores;

import java.util.ArrayList;

public class Produto {

	private String nome;
	private int quantidade;
	private double valor;
	

		public static ArrayList<Produto> dados = new ArrayList<>();

		
		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public int getQuantidade() {
			return quantidade;
		}


		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}


		public double getValor() {
			return valor;
		}


		public void setValor(double valor) {
			this.valor = valor;
		}
		
	
}

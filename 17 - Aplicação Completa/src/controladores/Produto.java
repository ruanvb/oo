package controladores;

import java.util.ArrayList;

public class Produto {

	public String nome;
	public int quantidade;
	public double valor;
	

		public static ArrayList<Produto> dados = new ArrayList<>();

		public static ArrayList<Produto> dadosTodos (){
			
			return dados;
			
		}
		
	
}

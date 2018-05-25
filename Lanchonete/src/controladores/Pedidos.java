package controladores;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedidos {

	// Data
	LocalDateTime tempo = LocalDateTime.now();
	int dia = tempo.getDayOfMonth();
	int mes = tempo.getMonthValue();
	int ano = tempo.getHour();

	// Hora
	LocalDate hora = tempo.toLocalDate();
	
	String data = dia+"/"+mes+"/"+ano+" - "+"hora";

	String cliente, produto, horaConsumo; 
	
	public static ArrayList<Pedidos> pedidos = new ArrayList<>();
	
	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public String getHoraConsumo() {
		return horaConsumo;
	}


	public void setHoraConsumo(String horaConsumo) {
		this.horaConsumo = horaConsumo;
	}
	

	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	int quantidade;

}

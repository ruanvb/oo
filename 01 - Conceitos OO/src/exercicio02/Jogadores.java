package exercicio02;

import javax.swing.JOptionPane;

public class Jogadores {

	static String nome;
	int idade;
	double altura;
	double peso;

	double somaAlturas = 0;

	int cadastrados = 0;

	double maioraltura;
	String maiorJogador;

	double maioridade;
	String jogadorMaisVelho;

	double maiorpeso;
	String jogadorMaisPesado;

	public void obterDados() {

		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do jogador"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do jogador"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do jogador"));

	}

	public void cadastros() {
		cadastrados++;
	}

	public void maiorJogador() {

		if (altura > maioraltura) {
			maioraltura = altura;
			maiorJogador = nome;
		}

	}

	public void jogadorMaisVelho() {

		if (idade > maioridade) {
			maioridade = idade;
			jogadorMaisVelho = nome;
		}

	}

	public void jogadorMaisPesado() {

		if (peso > maiorpeso) {
			maiorpeso = peso;
			jogadorMaisPesado = nome;
		}

	}

	public void somaAlturas() {

		somaAlturas += altura;

	}

	public double mediaAlturas() {

		double mediaAlturas = somaAlturas / cadastrados;
		return mediaAlturas;

	}

	public void laco() {

		nome = JOptionPane.showInputDialog("Informe o nome do jogador ou SAIR para finalizar.");
		
		do {
			
			obterDados();
			cadastros();
			maiorJogador();
			jogadorMaisVelho();
			jogadorMaisPesado();
			somaAlturas();
			mediaAlturas();
			
			nome = JOptionPane.showInputDialog("Informe o nome do jogador ou SAIR para finalizar.");
			
		} while (!Jogadores.nome.toLowerCase().equals("sair"));

	}

	public void informacoes() {

		String informacoes = "";

		informacoes += "Quantidade de jogadores cadastrados: " + cadastrados;
		informacoes += "\n\nNome do maior jogador: " + maiorJogador;
		informacoes += "\nAltura do maior jogador: " + maioraltura;
		informacoes += "\n\nNome do jogador mais velho: " + jogadorMaisVelho;
		informacoes += "\nIdade do jogador mais velho: " + maioridade;
		informacoes += "\n\nNome do jogador mais pesado: " + jogadorMaisPesado;
		informacoes += "\nPeso do jogador mais pesado: " + maiorpeso;
		informacoes += "\n\nMédia das alturas dos jogadores: " + mediaAlturas();

		JOptionPane.showMessageDialog(null, informacoes);

	}

}

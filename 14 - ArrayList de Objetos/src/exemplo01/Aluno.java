package exemplo01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {

	// Atributos da classe
	private String nome;
	private double nota1, nota2, media;

	// ArrayList
	ArrayList<Aluno> dados = new ArrayList<>();

	// M�todo para cadastrar um aluno
	private void cadastrar() {

		// Instanciar um objeto
		Aluno a = new Aluno();
		a.nome = JOptionPane.showInputDialog("Informe seu nome");
		a.nota1 = Double.parseDouble(JOptionPane.showInputDialog("1� nota"));
		a.nota2 = Double.parseDouble(JOptionPane.showInputDialog("2� nota"));
		a.media = (a.nota1 + a.nota2) / 2;

		// Cadastrar no ArrayList
		dados.add(a);

	}

	// M�todo para exibir os alunos cadastrados
	private void listar() {

		// Agrupar dados
		String agruparDados = "Alunos cadastrados:\n\n";

		// La�o de repeti��o
		for (int i = 0; i < dados.size(); i++) {

			agruparDados += (i + 1) + "� aluno: " + dados.get(i).nome + "\n";
			agruparDados += "1 � nota: " + dados.get(i).nota1 + "\n";
			agruparDados += "2 � nota: " + dados.get(i).nota2 + "\n";
			agruparDados += "M�dia: " + dados.get(i).media + "\n\n";

		}

		// Exibir os dados
		JOptionPane.showMessageDialog(null, agruparDados);

	}

	// M�todo menu
	public void menu() {

		// MENU
		String menu = "****MENU****\n\n";
		menu += "1) Cadastrar\n";
		menu += "2) Listar\n";
		menu += "3) Sair";

		// Op��o selecionada no menu
		int opcao = 0;

		// La�o
		do {

			// Obter a op��o desejada
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			// Realizar a a��o
			switch (opcao) {

			case 1:
				cadastrar();
				break;

			case 2:
				listar();
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "Obrigado por usar nosso sistema legal :)");

			}

		} while (opcao != 3);

	}
	
}

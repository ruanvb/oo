package exercicio06;

import javax.swing.JOptionPane;

public class Aluno {

	String nome = "";
	int sexo;
	double primeiranota = 0;
	double segundanota = 0;
	double terceiranota = 0;
	double quartanota = 0;
	double quantidadenotas = 0;
	double quanthomens = 0;
	double quantmulheres = 0;
	double quantalunos = 0;
	double tiraram10 = 0;
	double tiraram99 = 0;
	double tiraram89 = 0;
	double tiraram79 = 0;
	double tiraram69 = 0;
	double abaixo5 = 0;
	double totalsexo = 0;
	String erro;
	double mediaaluno = 0;
	boolean valida = false;

	int continuar = 0;

	public void ObterDados() {

		try {
			nome = JOptionPane.showInputDialog("Informe o nome.");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Falha: " + e.getMessage());
		}

		// Tratamento de erros
		do

		{
			try {
				sexo = Integer
						.parseInt(JOptionPane.showInputDialog("Informe o sexo: \n 1 - Masculino \n 2 - Feminino")); // Obter
																													// o
																													// sexo
				valida = true; // Validar
				if (sexo == 1) {
					quanthomens++;
				} else if (sexo == 2) {
					quantmulheres++;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "N�mero/car�ctere inv�lido." + e.getMessage()); // Mensagem
																									// de
																									// erro
				valida = false;
			}
		} while (!valida);

		// Obter primeira nota
		do {
			try {
				primeiranota = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota."));
				quantidadenotas++;
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "N�mero/car�ctere inv�lido.");
				valida = false;
			}
		} while (!valida);

		// Obter segunda nota
		do {
			try {
				segundanota = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota."));
				quantidadenotas++;
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "N�mero/car�ctere inv�lido.");
				valida = false;
			}
		} while (!valida);

		// Obter terceira nota
		do {
			try {
				terceiranota = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota."));
				quantidadenotas++;
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "N�mero/car�ctere inv�lido.");
				valida = false;
			}
		} while (!valida);

		// Obter quarta nota
		do {
			try {
				quartanota = Double.parseDouble(JOptionPane.showInputDialog("Informe a quarta nota."));
				quantidadenotas++;
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "N�mero/car�ctere inv�lido." + e.getMessage());
				valida = false;
			}
		} while (!valida);

	}

	public void calcularMedia() {

		// C�lculo da m�dia do aluno
		mediaaluno = (primeiranota + segundanota + terceiranota + quartanota) / 4;

		// Condicional para informar as condi��es do aluno de acordo com a sua
		// media
		if (mediaaluno == 10) {
			JOptionPane.showMessageDialog(null, "M�dia: " + mediaaluno + "\nParab�ns! Voc� atingiu nota m�xima.");
			tiraram10++;
		} else if ((mediaaluno < 10) && (mediaaluno > 8.9)) {
			JOptionPane.showMessageDialog(null, "M�dia: " + mediaaluno + "\nSua m�dia est� �tima!");
			tiraram99++;
		} else if ((mediaaluno < 8.9) && (mediaaluno > 7.9)) {
			JOptionPane.showMessageDialog(null, "M�dia: " + mediaaluno + "\nSua m�dia est� boa.");
			tiraram89++;
		} else if ((mediaaluno < 7.9) && (mediaaluno > 6.9)) {
			JOptionPane.showMessageDialog(null, "M�dia: " + mediaaluno + "\nSua m�dia � satisfat�ria.");
			tiraram79++;
		} else if ((mediaaluno < 6.9) && (mediaaluno > 5)) {
			JOptionPane.showMessageDialog(null,
					"M�dia: " + mediaaluno + "\nVoc� n�o est� na m�dia e ter� que recuper�-la.");
			tiraram69++;
		} else if (mediaaluno < 5) {
			JOptionPane.showMessageDialog(null,
					"M�dia: " + mediaaluno + "\nVoc� n�o atingiu a m�dia m�nima e est� reprovado.");
			abaixo5++;
		}

		quantalunos++;

	}

	public void exibirResultados() {

		// Total de pessoas informadas
		totalsexo = (quanthomens) + (quantmulheres);
		// Vari�veis para
		double porcenthomens = (100 / totalsexo) * quanthomens;
		double porcentmulheres = (100 / totalsexo) * quantmulheres;
		String mensagemfinal = "";
		mensagemfinal += "Quantidade e percentual de homens e mulheres:\nHomens:" + quanthomens + " (" + porcenthomens
				+ "%)";
		mensagemfinal += "\nMulheres: " + quantmulheres + " (" + porcentmulheres + "%)";
		mensagemfinal += "\n\n Alunos que tiraram 10: " + tiraram10 + " (" + (100 / quantalunos) * tiraram10
				+ "%) Parab�ns!";
		mensagemfinal += "\nAlunos que tiraram m�dia entre 9.0 e 9.9: " + tiraram99 + " ("
				+ (100 / quantalunos) * tiraram99 + "%) �timo!";
		mensagemfinal += "\nAlunos que tiraram m�dia entre 8.0 e 8.9: " + tiraram89 + " ("
				+ (100 / quantalunos) * tiraram89 + "%) Bom!";
		mensagemfinal += "\nAlunos que tiraram m�dia entre 7.0 e 7.9: " + tiraram79 + " ("
				+ (100 / quantalunos) * tiraram79 + "%) Satisfat�rio!";
		mensagemfinal += "\nAlunos que tiraram m�dia entre 6.0 e 6.9: " + tiraram69 + " ("
				+ (100 / quantalunos) * tiraram69 + "%) Recupera��o!";
		mensagemfinal += "\nAlunos que tiraram m�dia abaixo de 5: " + abaixo5 + " (" + (100 / quantalunos) * abaixo5
				+ "%) Reprovado!";

		JOptionPane.showMessageDialog(null, mensagemfinal);

	}

	public void laco() {

		do {
			ObterDados();
			calcularMedia();

			continuar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro aluno?", "", 0);

		} while (continuar == 0);

	}

}

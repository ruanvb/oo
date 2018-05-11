package exercicio10;

import javax.swing.JOptionPane;

public class Votacao {

	int candidato1 = 0;
	int candidato2 = 0;
	int candidato3 = 0;
	int candidato4 = 0;
	int votacao = 0;

	boolean valida = false;

	public void obterDados() {

		do {
			try {
				votacao = Integer.parseInt(JOptionPane.showInputDialog(
						"Para quem voc� ir� votar? \n 1 - Ruan \n 2 - Pedro \n 3 - Gabriel \n 4 - Jo�o \n\n 0 - Exibir resultados"));
				valida = true;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Falha: " + e.getMessage());
				valida = false;
			}
		} while (valida != true);

	}

	public void verificarDados() {

		if (votacao == 1) {
			JOptionPane.showMessageDialog(null, "Voc� votou no candidato 1 - Ruan");
			candidato1++;
		} else if (votacao == 2) {
			JOptionPane.showMessageDialog(null, "Voc� votou no candidato 2 - Pedro");
			candidato2++;
		} else if (votacao == 3) {
			JOptionPane.showMessageDialog(null, "Voc� votou no candidato 3 - Gabriel");
			candidato3++;
		} else if (votacao == 4) {
			JOptionPane.showMessageDialog(null, "Voc� votou no candidato 4 - Jo�o");
			candidato4++;
		}

	}
	
	public void calcularDados() {

		int totaldevotos = candidato1 + candidato2 + candidato3 + candidato4;
		int porcent1 = (100 / totaldevotos) * candidato1;
		int porcent2 = (100 / totaldevotos) * candidato2;
		int porcent3 = (100 / totaldevotos) * candidato3;
		int porcent4 = (100 / totaldevotos) * candidato4;
		
		if ((candidato1 == candidato2) && (candidato3 == candidato4) && (candidato2 == candidato3)) {
			JOptionPane.showMessageDialog(null,
					"Houve um empate entre todos os candidatos."
							+ "\n\n Quantidade de votos e percentual de cada candidato: " + "\n 1 - Ruan: " + candidato1
							+ " votos (" + porcent1 + "%)" + "\n 2 - Pedro: " + candidato2 + " votos (" + porcent2
							+ "%)" + "\n 3 - Gabriel: " + candidato3 + " votos (" + porcent3 + "%)" + "\n 4 - Jo�o: "
							+ candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato1 == candidato2) && (candidato1 > candidato3) && (candidato1 > candidato4)) {
			JOptionPane.showMessageDialog(null,
					"Houve um empate entre: 1 - Ruan e 2 - Pedro."
							+ "\n\n Quantidade de votos e percentual de cada candidato: " + "\n 1 - Ruan: " + candidato1
							+ " votos (" + porcent1 + "%)" + "\n 2 - Pedro: " + candidato2 + " votos (" + porcent2
							+ "%)" + "\n 3 - Gabriel: " + candidato3 + " votos (" + porcent3 + "%)" + "\n 4 - Jo�o: "
							+ candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato1 == candidato3) && (candidato3 > candidato4) && (candidato3 > candidato2)) {
			JOptionPane.showMessageDialog(null,
					"Houve um empate entre: 1 - Ruan e 3 - Gabriel."
							+ "\n\n Quantidade de votos e percentual de cada candidato: " + "\n 1 - Ruan: " + candidato1
							+ " votos (" + porcent1 + "%)" + "\n 2 - Pedro: " + candidato2 + " votos (" + porcent2
							+ "%)" + "\n 3 - Gabriel: " + candidato3 + " votos (" + porcent3 + "%)" + "\n 4 - Jo�o: "
							+ candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato1 == candidato4) && (candidato1 > candidato3) && (candidato1 > candidato2)) {
			JOptionPane.showMessageDialog(null,
					"Houve um empate entre: 1 - Ruan e 4 - Jo�o."
							+ "\n\n Quantidade de votos e percentual de cada candidato: " + "\n 1 - Ruan: " + candidato1
							+ " votos (" + porcent1 + "%)" + "\n 2 - Pedro: " + candidato2 + " votos (" + porcent2
							+ "%)" + "\n 3 - Gabriel: " + candidato3 + " votos (" + porcent3 + "%)" + "\n 4 - Jo�o: "
							+ candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato2 == candidato3) && (candidato2 > candidato4) && (candidato2 > candidato1)) {
			JOptionPane.showMessageDialog(null,
					"Houve um empate entre: 2 - Pedro e 3 - Gabriel."
							+ "\n\n Quantidade de votos e percentual de cada candidato: " + "\n 1 - Ruan: " + candidato1
							+ " votos (" + porcent1 + "%)" + "\n 2 - Pedro: " + candidato2 + " votos (" + porcent2
							+ "%)" + "\n 3 - Gabriel: " + candidato3 + " votos (" + porcent3 + "%)" + "\n 4 - Jo�o: "
							+ candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato2 == candidato4) && (candidato2 > candidato3) && (candidato2 > candidato1)) {
			JOptionPane.showMessageDialog(null,
					"Houve um empate entre: 2 - Pedro e 4 - Jo�o."
							+ "\n\n Quantidade de votos e percentual de cada candidato: " + "\n 1 - Ruan: " + candidato1
							+ " votos (" + porcent1 + "%)" + "\n 2 - Pedro: " + candidato2 + " votos (" + porcent2
							+ "%)" + "\n 3 - Gabriel: " + candidato3 + " votos (" + porcent3 + "%)" + "\n 4 - Jo�o: "
							+ candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato3 == candidato4) && (candidato3 > candidato2) && (candidato3 > candidato1)) {
			JOptionPane.showMessageDialog(null,
					"Houve um empate entre: 3 - Gabriel e 4 - Jo�o."
							+ "\n\n Quantidade de votos e percentual de cada candidato: " + "\n 1 - Ruan: " + candidato1
							+ " votos (" + porcent1 + "%)" + "\n 2 - Pedro: " + candidato2 + " votos (" + porcent2
							+ "%)" + "\n 3 - Gabriel: " + candidato3 + " votos (" + porcent3 + "%)" + "\n 4 - Jo�o: "
							+ candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato1 > candidato2) || (candidato2 > candidato3) && (candidato3 > candidato4)) {
			JOptionPane.showMessageDialog(null,
					"O vencedor foi: 1 - Ruan." + "\n\n Quantidade de votos e percentual de cada candidato: "
							+ "\n 1 - Ruan: " + candidato1 + " votos (" + porcent1 + "%)" + "\n 2 - Pedro: "
							+ candidato2 + " votos (" + porcent2 + "%)" + "\n 3 - Gabriel: " + candidato3 + " votos ("
							+ porcent3 + "%)" + "\n 4 - Jo�o: " + candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato2 > candidato1) || (candidato1 > candidato3) && (candidato3 > candidato4)) {
			JOptionPane.showMessageDialog(null,
					"O vencedor foi: 2 - Pedro." + "\n\n Quantidade de votos e percentual de cada candidato: "
							+ "\n 1 - Ruan: " + candidato1 + " votos (" + porcent1 + "%)" + "\n 2 - Pedro: "
							+ candidato2 + " votos (" + porcent2 + "%)" + "\n 3 - Gabriel: " + candidato3 + " votos ("
							+ porcent3 + "%)" + "\n 4 - Jo�o: " + candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato3 > candidato2) || (candidato2 > candidato4) && (candidato4 > candidato1)) {
			JOptionPane.showMessageDialog(null,
					"O vencedor foi: 3 - Gabriel." + "\n\n Quantidade de votos e percentual de cada candidato: "
							+ "\n 1 - Ruan: " + candidato1 + " votos (" + porcent1 + "%)" + "\n 2 - Pedro: "
							+ candidato2 + " votos (" + porcent2 + "%)" + "\n 3 - Gabriel: " + candidato3 + " votos ("
							+ porcent3 + "%)" + "\n 4 - Jo�o: " + candidato4 + " votos (" + porcent4 + "%)");

		} else if ((candidato4 > candidato2) || (candidato2 > candidato3) && (candidato3 > candidato1)) {
			JOptionPane.showMessageDialog(null,
					"O vencedor foi: 4 - Jo�o." + "\n\n Quantidade de votos e percentual de cada candidato: "
							+ "\n 1 - Ruan: " + candidato1 + " votos (" + porcent1 + "%)" + "\n 2 - Pedro: "
							+ candidato2 + " votos (" + porcent2 + "%)" + "\n 3 - Gabriel: " + candidato3 + " votos ("
							+ porcent3 + "%)" + "\n 4 - Jo�o: " + candidato4 + " votos (" + porcent4 + "%)");

		}

	}

	public void laco() {

		do {

			obterDados();
			verificarDados();

		} while (votacao != 0);

		calcularDados();
		
	}

}

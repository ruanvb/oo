package exercicio02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int chute = 0;
		int tentativas = 0;

		int limiteminimo = 0;
		int limitemaximo = 100;

		Double gerarAleatorio = Math.random();

		int numerorandomico = (int) Math.round(limiteminimo + gerarAleatorio * limitemaximo);

		for (int i = 0; i < 30; i++) {

			chute = Integer.parseInt(JOptionPane.
					showInputDialog("Insira um número\n\n" + "Tentativa: " + (i + 1)));

			if (chute == numerorandomico) {

				tentativas = i + 1;
				break;
			}else if ((numerorandomico - chute) < 10 && (numerorandomico - chute)>-10) {

				JOptionPane.showMessageDialog(null, "Está perto!");

			} else if ((numerorandomico - chute) > 10 && (numerorandomico - chute) < -10 
					|| (numerorandomico - chute) < 20 && (numerorandomico - chute) > -20) {

				JOptionPane.showMessageDialog(null, "Está longe!");

			} else{
				
				JOptionPane.showMessageDialog(null, "Ihhhhh! Muito longe");
				
			}


		}


		if (tentativas == 1) {

			JOptionPane.showMessageDialog(null, "Nossa! Acertou na mosca");

		} else if (tentativas < 5) {

			JOptionPane.showMessageDialog(null, "Parabéns! Você é bom de adivinhação");

		} else if (tentativas < 10) {

			JOptionPane.showMessageDialog(null, "Muito bom. Continue assim");

		} else if (tentativas < 20) {

			JOptionPane.showMessageDialog(null, "Mm... Podia ser melhor. Continue tentando");

		} else if (tentativas > 20) {

			JOptionPane.showMessageDialog(null, "Meio lerdo você, hein?");

		}

	}

}

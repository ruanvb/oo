package exercicio01;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta {

	ArrayList<Double> depositar = new ArrayList<Double>();
	ArrayList<Double> sacar = new ArrayList<Double>();

	double saldo = 0;

	String menu = "";
	String opcao = "";

	String extrato = "";

	int continuar = 0;

	public void obterOpcao() {

		int deposit = -1;
		int sac = -1;

		menu += "a. Depositar \n" + "b. Sacar  \n" + "c. Extrato \n" + "d. Saldo \n" + "e. Sair";

		for (int i = 0; i < 100; i++) {

			opcao = JOptionPane.showInputDialog(menu);

			if (opcao.equalsIgnoreCase("a")) {

				for (deposit = deposit + 1; deposit < 100; deposit++) {

					depositar.add(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito")));

					saldo += depositar.get(deposit);

					JOptionPane.showMessageDialog(null, "Depósito efetuado com sucesso");

					continuar = JOptionPane.showConfirmDialog(null, "Deseja efetuar outro depósito?");

					if (continuar != 0) {
						break;
					}

				}

			} else if (opcao.equalsIgnoreCase("b")) {

				for (sac = sac + 1; sac < 100; sac++) {

					sacar.add(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque")));

					if (sacar.get(sac) < saldo) {

						saldo -= sacar.get(sac);
						JOptionPane.showMessageDialog(null, "Saque efetuado com sucesso.\n\nSaldo atual: R$" + saldo);

						continuar = JOptionPane.showConfirmDialog(null, "Deseja efetuar outro saque?");

						if (continuar != 0) {
							break;
						}

					} else {

						sacar.remove(sac);
						JOptionPane.showMessageDialog(null, "O valor informado para saque é maior do que os saldo.");
						break;
					}

				}

			} else if (opcao.equalsIgnoreCase("c")) {

				for (int ext = 0; ext < 100; ext++) {

					if (ext < depositar.size()) {
						extrato += "DEPÓSITO: R$" + depositar.get(ext) + "\n";
					}
					if (ext < sacar.size()) {
						extrato += "SAQUE: R$" + sacar.get(ext) + "\n";
					}

				}

				extrato += "\n\nSALDO: R$" + saldo;

				JOptionPane.showMessageDialog(null, extrato);

				extrato = "";

			} else if (opcao.equalsIgnoreCase("d")) {

				JOptionPane.showMessageDialog(null, "O saldo atual é: " + saldo);

			} else if (opcao.equalsIgnoreCase("e")) {

				break;

			}

		}

	}

}

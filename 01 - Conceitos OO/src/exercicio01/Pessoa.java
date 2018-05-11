package exercicio01;

import javax.swing.JOptionPane;

public class Pessoa {

	String[] dados = new String[4];

	int menorde18 = 0;
	int maiorde18 = 0;

	int masculino = 0;
	int feminino = 0;

	int gerente = 0;
	int atendente = 0;
	int acougueiro = 0;
	int secretaria = 0;
	int almoxarife = 0;
	int padeiro = 0;
	int estagiario = 0;
	int outros = 0;

	public void obterDados() {

		dados[0] = JOptionPane.showInputDialog("Informe o nome.");
		dados[1] = JOptionPane.showInputDialog("Informe a idade.");
		dados[2] = JOptionPane.showInputDialog("Informe o sexo:\n\n1 - Masculino\n2 - Feminino");
		dados[3]= JOptionPane.showInputDialog(
				"Informe o cargo, sendo que: \n\n 1 - Gerente \n 2 - Atendente \n 3 - Açougueiro \n 4 - Secretária \n 5 - Almoxarife \n 6 - Padeiro \n 7 - Estagiário \n 8 - Outro");

	}
	
	public void contarSexo() {
		
		if(dados[2].equals("1")){
			masculino++;
		}else{
			feminino++;
		}
		
	}

	public void contarIdade() {

		int idade = Integer.parseInt(dados[1]);
		
		if (idade >= 18) {
			maiorde18++;
		} else {
			menorde18++;
		}

	}

	public void contarCargo() {

		int cargo = Integer.parseInt(dados[3]);
		
		if (cargo == 1) {
			gerente++;
		} else if (cargo == 2) {
			atendente++;
		} else if (cargo == 3) {
			acougueiro++;
		} else if (cargo == 4) {
			secretaria++;
		} else if (cargo == 5) {
			almoxarife++;
		} else if (cargo == 6) {
			padeiro++;
		} else if (cargo == 7) {
			estagiario++;
		} else {
			outros++;
		}

	}
	
	public void laco(){
		
		int continuar;
	
		do{
		obterDados();
		contarSexo();
		contarIdade();
		contarCargo();
		
		continuar = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outra pessoa?");
		
		}while(continuar == 0);
		
	}
	
	public void informacoes(){
		
		JOptionPane.showMessageDialog(null, "Pessoas menores de 18 anos: "+menorde18+
				"\n Pessoas maiores de 18 anos: "+maiorde18+
				"\n\n Quantidade de pessoas do sexo masculino: "+masculino+ 
		        "\n Quantidade de pessoas do sexo feminino: "+feminino+
		        "\n\n Quantidade de gerentes: "+gerente+ 
		        "\n Quantidade de atendentes: "+atendente+ 
		        "\n Quantidade de açougueiros: "+acougueiro+
		        "\n Quantidade de secretárias: "+secretaria+
		        "\n Quandade de almoxarifes:"+almoxarife+
		        "\n Quantidade de padeiros: "+padeiro+
		        "\n Quantidade de estagiários: "+estagiario+
		        "\n Pessoas que trabalham em outros empregos: "+outros);
		
	}

}

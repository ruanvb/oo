package exercicio04;

import javax.swing.JOptionPane;

public class Enquete {

	int opcao;

	double excelente = 0;
	double otimo = 0;
	double bom = 0;
	double regular = 0;
	double ruim = 0;
	
	double total = 0;

	int idade;
	int criancas = 0;
	int adolescentes = 0;
	int adultos = 0;
	
	boolean valida = false;

	public void obterOpiniao() {


		opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"O que você achou do filme Alice no País das Maravilhas? \n1 - Excelente \n2 - Ótimo \n3 - Bom \n4 - Regular\n 5 - Ruim \n6 - Exibir Resultados"));
		
		if (opcao == 1) {
			excelente++;
		} else if (opcao == 2) {
			otimo++;
		} else if (opcao == 3) {
			bom++;
		} else if (opcao == 4) {
			regular++;
		} else if (opcao == 5) {
			ruim++;
		}else if(opcao == 6){
			valida = true;
		}


	}

	public void obterIdade() {

		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		
		if ((idade <= 9) && (idade >= 0)) {
			criancas++;
		} else if ((idade >= 10) && (idade <= 17)) {
			adolescentes++;
		} else if((idade >17)){
			adultos++;
		}

	}

	public void laco() {


		for(int i = 0; i<999; i++){
		obterOpiniao();
		
		if(opcao ==6){
			break;
		}
		
		obterIdade();
		
		}
	}

	public void resultados() {

		total = excelente + otimo + bom + regular + ruim;
		
		String frase = "Excelente: " + ((100 / total) * excelente) + "%" + 
				"\nÓtimo: " + ((100 / total) * otimo) + "%"
				+ "\nBom: " + ((100 / total) * bom) + "%" + 
				"\nRegular: " + ((100 / total) * regular) + "%" + 
				"\nRuim: " + ((100 / total) * ruim) + "%" + 
				
				"\n\n Quantidade de crianças: " + criancas
				+ "\n Quantidade de adolescentes: " + adolescentes + 
				"\n Quantidade de adultos: " + adultos;
	
		JOptionPane.showMessageDialog(null, frase);

	}

}

package exercicio12;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Investimento {

	double valorInvestimento = 0;
    int tempoInvestimento = 0;        
    int indiceMes = 0;
    int indiceAno = 0;
    int totalFinal = 0;
    boolean valida = false;
    String exibirfinal = "";
    String exibiranofinal = "";
    double ultimomes = 0;
    double calculomensal = 0;
    double calculoanual = 0;
    double ate6meses = 0;
    String mensagem = exibirfinal;
    
    
    public void obterDados(){
    	
    	//Capturar o valor à ser investido.
        do {
            try {
                valorInvestimento = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor à ser investido"));
                valida = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Caráctere/Valor Inválido. Digite novamente.");
            }
        } while (!valida);

        //Capturar o tempo à ser investido
        do {
            try {
                tempoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo à ser investido (em meses)"));
                valida = true;
                
                if ((tempoInvestimento<1)||(tempoInvestimento>48)) { //IF para delimitar o tempo de investimento
                   do { 
                       try {
                            tempoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo à ser investido (em meses)\nMínimo 1 mês - Máximo 48 meses."));
                   } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Caráctere/Valor Inválido. Digite Novamente.");
                   }
                
                   } while ((tempoInvestimento<1)||(tempoInvestimento>48));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Caráctere/Valor Inválido. Digite novamente.");
                valida = false; 
            }
            } while (!valida);
    	
    }
    
    
    public void exibirInvestimento(){
    
    	double calculoPoupanca = valorInvestimento*1.0037;
    	
    	  do{
              DecimalFormat decimal = new DecimalFormat("0.00"); 
              String valorFormatado = decimal.format(calculoPoupanca);
              indiceMes++; //Adicionar um mês ao cálculo
              ultimomes = calculoPoupanca; // Definir o último mês calculado
              calculomensal = ultimomes*1.0037; //Calcular o juros em relação ao último mês
              calculoPoupanca = calculomensal; // Definir o cálculo
              exibirfinal += indiceMes+"º Mês: " +valorFormatado+"\n";
              mensagem = exibirfinal;
          }while (indiceMes != tempoInvestimento);
    	
    	  JOptionPane.showMessageDialog(null, "POUPANÇA\n"+mensagem);
    	  
    }
    
    public void laco(){
    	
    	obterDados();
    	exibirInvestimento();
    	
    }
	
}

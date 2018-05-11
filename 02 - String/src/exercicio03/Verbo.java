package exercicio03;

import javax.swing.JOptionPane;

public class Verbo {

	String verbo = "";
	StringBuilder sb = new StringBuilder(verbo);
	
	String exibir = "A conjugação do verbo "+verbo+" é: \n\n";
	
	boolean valida = false;
	
	public void obterVerbo(){
		
		do{
			
			verbo = JOptionPane.showInputDialog("Informe um verbo terminado em 'AR' ");
			
			if(verbo.contains("ar")){
				valida = true;
			}
			
		}while(valida == false);
		
	}
	
	public void conjugarVerbo(){
		
		for(int i = 0; i<verbo.length(); i++){
			
			if(i == 0){
				exibir += "Eu "+verbo.replace("ar", "o")+"\n";
			}else if(i == 1){
				exibir += "Tu "+verbo.replace("ar", "as")+"\n";
			}else if(i == 2){
				exibir += "Ele "+verbo.replace("ar", "a")+"\n";
			}else if(i == 3){
				exibir += "Nós "+verbo.replace("ar", "amos")+"\n";
			}else if(i == 4){
				exibir += "Vós "+verbo.replace("ar", "áis")+"\n";
			}else if(i == 5){
				exibir += "Eles "+verbo.replace("ar", "am");
			}
			
		}
		
		JOptionPane.showMessageDialog(null, exibir);
		
	}
	
	
	
}

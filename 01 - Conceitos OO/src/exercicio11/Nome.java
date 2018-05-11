package exercicio11;

import javax.swing.JOptionPane;

public class Nome {

		String nome;
		String nome1 = "";
	    String nome2 = "";
	    String nome2maisnome1 = "";
	    String nome3 = "";
	    String nome3maisnomes = "";
	    String final1 = "";
	    String ultimonome = "";
	    int indice = 1;
	    
	    boolean valida = false;
	    
	    public void obterNome(){
	    	
	    	nome = JOptionPane.showInputDialog("Informe um nome ou SAIR para finalizar.");
	    	
	    }
	    
	    public void verificarNome(){
	    	
	    	if((indice == 1)&&(!nome.equals("sair"))){
	            nome1 += nome;
	            indice++;
	        }else if((indice ==2)&&(!nome.equals("sair"))){
	            nome2 += nome;
	            nome2maisnome1 += " e "+(nome2);
	            indice++;
	        }else if ((indice ==3)&&(!nome.equals("sair"))){
	            nome3 += nome;
	            nome3maisnomes += ", "+(nome3)+", ";
	            indice++;
	        }else if((indice >3)&&(!nome.equals("sair"))){
	            indice++;
	            ultimonome += nome+", ";
	        }

	        if (!nome.equals("sair")) {
	        final1 =(ultimonome)+(nome1)+ (nome3maisnomes)+(nome2maisnome1);
	        }
	        
	        if(nome.toLowerCase().equals("sair")){
	        	
	        	valida = true;
	        	
	        }
	    	
	    }
	    
	    public void laco(){
	    	
	    	do{
	    		
	    		obterNome();
	    		verificarNome();
	    		
	    	}while(valida != true);
	    	
	    	JOptionPane.showMessageDialog(null, final1);
	    	
	    }
	
}

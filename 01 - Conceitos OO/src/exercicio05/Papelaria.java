package exercicio05;

import javax.swing.JOptionPane;

public class Papelaria {
	
	String produto;
	double valor;
	String desconto;
	
	double valor1=0;
    double valor2=0;
    double valor3=0;
    double valor4=0;
    double valor5=0;
    double valor6=0;
    double valor7=0;
    double valor8=0;
    double valor9=0;
    double valor10=0;
    
    int indice = 0;
	
	public void obterDados(){
		
		produto = JOptionPane.showInputDialog("Informe o nome do produto");
        valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto em R$"));
		
	}
	
	public void obterDesconto(){
		
		 while (indice<=10) {
             indice++;
             valor1 = valor*0.95;
             double valor11 = valor1*indice;
             desconto += "\n"+indice+" x R$"+valor1+ " = R$"+valor11+"0";
             indice++;
             valor2 = valor*0.90;
             double valor22 = valor2*indice;
             desconto += "\n"+indice+" x R$"+valor2+ " = R$"+valor22+"0";
             indice++;
             valor3 = valor*0.85;
             double valor33 = valor3*indice;
             desconto += "\n"+indice+" x R$"+valor3+ " = R$"+valor33+"0";
             indice++;
             valor4 = valor*0.80;
             double valor44 = valor4*indice;
             desconto += "\n"+indice+" x R$"+valor4+ " = R$"+valor44+"0";
             indice++;
             valor5 = valor*0.75;
             double valor55 = valor5*indice;
             desconto += "\n"+indice+" x R$"+valor5+ " = R$"+valor55+"0";
             indice++;
             valor6 = valor*0.70;
             double valor66 = valor6*indice;
             desconto += "\n"+indice+" x R$"+valor6+ " = R$"+valor66+"0";
             indice++;
             valor7 = valor*0.65;
             double valor77 = valor7*indice;
             desconto += "\n"+indice+" x R$"+valor7+ " = R$"+valor77+"0";
             indice++;
             valor8 = valor*0.60;
             double valor88 = valor8*indice;
             desconto += "\n"+indice+" x R$"+valor8+ " = R$"+valor88+"0";
             indice++;
             valor9 = valor*0.55;
             double valor99 = valor9*indice;
             desconto += "\n"+indice+" x R$"+valor9+ " = R$"+valor99+"0";
             indice++;
             valor10 = valor*0.50;
             double valor100 = valor10*indice;
             desconto += "\n"+indice+" x R$"+valor10+ " = R$"+valor100+"0";
             indice++;
       }
     
		 JOptionPane.showMessageDialog(null, desconto);
		
	}
	
	

}

package ex11_JFormattedTextField;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class Principal {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("JFormattedTextField");
		formulario.setSize(280, 80);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		// JLabel
		JLabel rotulo = new JLabel("CPF");
		rotulo.setBounds(10, 10, 50, 20);
		
		//Elabora��o da m�scara (O Try/Catch � obrigat�rio para o funcionamento da m�scara)
		MaskFormatter mascaraCpf = null;
		try {
			mascaraCpf = new MaskFormatter("###.###.###-##");
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Falha na m�scara.");
		}

		// JFormattedTextField
		JFormattedTextField campoFormatado = new JFormattedTextField(mascaraCpf);
		campoFormatado.setBounds(50, 10, 200, 20);
		
		// Adicionar elementos no JFrame
		formulario.add(rotulo);
		formulario.add(campoFormatado);
		
		// Exibir formul�rio
		formulario.setVisible(true);
		
	}

}

/*
"#" indica que qualquer n�mero poder� ser inserido (0-9);
"U" indica que qualquer letra (a-z) poder� ser inserida. A m�scara converter� letras min�sculas em mai�sculas;
"L" indica qualquer letra (a-z) poder� ser inserida. A m�scara converter� letras mai�sculas em min�sculas;
"?" indica qualquer letra (a-z) poder� ser inserida. A m�scara manter� a letra inserida;
"A" indica qualquer letra ou numero (0-9 e a-z) poder� ser inserido;
"H" indica qualquer caracter hexadecimal (0-9 a-f) poder� ser inserido;
"*" indica qualquer coisa, incluindo caracteres especiais poder�o ser inseridos. 
Fontes: https://www.devmedia.com.br/java-swing-conheca-os-componentes-jtextfield-e-jformattedtextfield/30981
        https://docs.oracle.com/javase/tutorial/uiswing/components/formattedtextfield.html
*/







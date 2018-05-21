package ex14_ImageIcon;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {
		
		/*
		 	DICAS IMPORTANTES PARA TRABALHAR COM IMAGENS, LEIA COM ATEN��O!
		 	
		 	1) Precisamos lembrar que quando exportamos um projeto devemos enviar as imagens junto, caso contr�rio n�o conseguiremos efetuar o carregamento delas.
		  
		    2) Para isso crie uma pasta no seu projeto (Bot�o direito sobre o projeto -> New -> Folder)
		    
		    3) Nessa pasta adicione as imagens que voc� quer exportar com o seu projeto
		    
		    4) Depois que voc� fez isso siga o exemplo abaixo para exibir a imagem.
		    
		    Essa t�cnica n�o serve apenas para imagens, voc� pode utilizar para aquivos de �udio, v�deo, textos....
		*/
		
		// JFrame
		JFrame formulario = new JFrame("Manipulando imagens");
		formulario.setSize(273, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		// Obtendo o caminho da imagem (Com a classe URL voc� pode criar um objeto que tenha o caminho para qualquer tipo de arquivo)
		URL caminhoDaImagem = Principal.class.getResource("/imagens/icone_java.png");
		
		// Objeto para obter a imagem
		ImageIcon imagem = new ImageIcon(caminhoDaImagem);		
		
		// JLabel
		JLabel exibirImagem = new JLabel();
		exibirImagem.setIcon(imagem);
		exibirImagem.setBounds(0, 0, 256, 256);
		
		// Adicionar ao JFrame
		formulario.add(exibirImagem);
		
		// Exibir formul�rio
		formulario.setVisible(true);
	}

}
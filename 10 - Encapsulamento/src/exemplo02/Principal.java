package exemplo02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Aluno a = new Aluno();
		
		//Atribuindo valores
		a.setNome("Andressa");
		a.setNota1(8);
		a.setNota2(9);
		
		//Exibindo os valores informados
		System.out.println(a.getNome());
		System.out.println(a.getNota1());
		System.out.println(a.getNota2());
		
	}

}

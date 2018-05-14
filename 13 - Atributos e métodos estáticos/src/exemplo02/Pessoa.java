package exemplo02;

public class Pessoa {

	//Atributos da classe
	private static int contador = 0;
	
	//Construtor
	public Pessoa(){
		
		//Contabilizar pessoa
		contador++;
		
		//Exibir a quantidade de pessoas informadas
		System.out.println(contador);
		
	}
	
	
	
}

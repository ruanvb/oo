package exemplo02;

public class Aluno {

	//Atributos da classe Aluno
	private String nome;
	private double nota1, nota2;
	
	//M�todos m�gicos - Acessos aos atributos privados
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	
	
}

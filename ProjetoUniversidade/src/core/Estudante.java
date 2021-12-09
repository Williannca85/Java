package core;

public class Estudante extends Pessoa{

	private int matricula;
	
	private String curso;
	

	public Estudante(String nome, String email, String telefone, int matricula, String curso) {
		super(nome, email, telefone);
		this.matricula = matricula;
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void imprimir () {
		
		System.out.println("Digite o nome: " + nome);
		
		System.out.println("Digite o email: " + email);
		
		System.out.println("Digite o telefone: " + telefone);
		
		System.out.println("Digite o matricula: " + matricula);
		
		System.out.println("Digite o curso: " + curso);
	}
	
}

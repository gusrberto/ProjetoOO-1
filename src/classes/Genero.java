package classes;

public class Genero {
	// Atributos
	private String nome;
	private String classificacaoIndicativa;
	
	// Construtor
	public Genero(String nome, String classInd) {
		this.nome = nome;
		this.classificacaoIndicativa = classInd;
	}
	// Gets e Sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setClassIndicativa(String classInd) {
		this.classificacaoIndicativa = classInd;
	}
	
	public String getClassIndicativa() {
		return classificacaoIndicativa;
	}
}

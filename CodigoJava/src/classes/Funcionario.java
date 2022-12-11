package classes;

public class Funcionario extends Pessoa {
	// Atributos
	private String funcao;
	private double salario;
	
	// Construtor
	public Funcionario(String nome, int idade, String funcao, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.funcao = funcao;
		this.salario = salario;
	}
	
	// Gets e Sets
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String getFuncao() {
		return funcao;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
}

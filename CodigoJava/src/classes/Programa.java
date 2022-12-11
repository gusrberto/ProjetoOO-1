package classes;

public class Programa {
	// Atributos
	private String nome;
	private String diaDeExibicao;
	private int horarioDeExibicao;
	private Genero genero;
	private Funcionario[] elenco = new Funcionario[30];
	private int tamElenco = 0;
	private int duracao;
	
	// Construtor
	public Programa() {
		super();
	}
	
	public Programa(String nome, String diaDeExibicao, int horarioDeExibicao,
			Genero genero, int duracao, int tamElenco) {
		this.nome = nome;
		this.diaDeExibicao = diaDeExibicao;
		this.horarioDeExibicao = horarioDeExibicao;
		this.genero = genero;
		this.duracao = duracao;
		this.tamElenco = tamElenco;
	}
	
	public String toString() {
		return "Nome do programa: " + nome +"\nDia de Exibicao: " + diaDeExibicao + " as " + 
				horarioDeExibicao + " horas" + "\nGenero: " + genero.getNome() +
				"\nClassificacao Indicativa: " + genero.getClassIndicativa() + "\nDuracao: " + duracao + " minutos"
				+ "\nTamanho do elenco: " + tamElenco;
	}
	// Gets e Sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setDiaDeExibicao(String diaDeExibicao) {
		this.diaDeExibicao = diaDeExibicao;
	}
	
	public String getDiaDeExibicao() {
		return diaDeExibicao;
	}
	
	public void setHorarioDeExibicao(int horarioDeExibicao) {
		this.horarioDeExibicao = horarioDeExibicao;
	}
	
	public int getHorarioDeExibicao() {
		return horarioDeExibicao;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getDuracao() {
		return duracao;
	}
	
	public void setTamElenco(int tamElenco) {
		this.tamElenco = tamElenco;
	}
	
	public int getTamElenco() {
		return tamElenco;
	}
	
	public void setElenco(Funcionario[] func) {
		this.elenco = func;
	}
	
	public Funcionario[] getElenco() {
		return this.elenco;
	}
	
	
	// Métodos
	public void adicionarFuncionario(Funcionario f) {
		elenco[this.getTamElenco()] = f;
		this.setTamElenco(this.getTamElenco()+1);
	}
	
	public void listarElenco() {
		System.out.println("--------ELENCO (" + this.getNome() + ")--------");
		for (int i = 0; i < this.getTamElenco(); i++) {
			System.out.println(elenco[i].getNome() + ", " + elenco[i].getIdade() + " anos" +
			" - " + elenco[i].getFuncao() + " / Salario: " + elenco[i].getSalario() + "R$");
		}
		System.out.println("---------------------------------------");
	}
	
}

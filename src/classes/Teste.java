package classes;

public class Teste {
	static Programa p1, p2;
	static Genero g1, g2;
	static Canal c1;
	static Funcionario f1, f2, f3, f4;
	
	public static void main(String[] args) {
		g1 = new Genero("Noticias", "Livre");
		g2 = new Genero("Esportes", "Livre");
		
		p1 = new Programa("Jornal Nacional", "Seg a Sex", 19, g1, 120, 0);
		p2 = new Programa("Globo Esporte", "Seg a Sab", 13, g2, 60, 0);
		
		f1 = new Funcionario("Joao", 35, "Diretor", 3700);
		f2 = new Funcionario("Maria", 22, "Apresentadora", 2500);
		f3 = new Funcionario("Pedro", 30, "Narrador", 2000);
		f4 = new Funcionario("Paula", 27, "Comentarista", 3100);
		
		c1 = new Canal("Globo", "Aberto", "Rede Globo", 10, "Todos", 0);
		
		p1.adicionarFuncionario(f1);
		p1.adicionarFuncionario(f2);
		p2.adicionarFuncionario(f1);
		p2.adicionarFuncionario(f3);
		p2.adicionarFuncionario(f4);
		
		c1.adicionarPrograma(p1);
		c1.adicionarPrograma(p2);
		
		System.out.println(p1.toString());
		System.out.println();
		System.out.println(p2.toString());
		System.out.println();
		System.out.println(c1.toString());
		System.out.println();
		c1.listarProgramacao();
		p1.listarElenco();
		p2.listarElenco();
	}
}

package Introdu��oPOO;

public class classeFuncion�rio {
	// atributos
	private String nome;
	private String setor;
	private String funcao;
	private int idade;
	private int registro;
	private double salario;

	// construtor
	public classeFuncion�rio(String nome, String setor, String funcao, int idade, int registro, double salario) {
		this.nome = nome;
		this.setor = setor;
		this.funcao = funcao;
		this.idade = idade;
		this.registro = registro;
		this.salario = salario;
	}

	public void print() {
		System.out.println("\nNome do funcion�rio: " + nome);
		System.out.println("\nIdade: " + idade+" anos");
		System.out.println("\nN�mero de Registro: " + registro);
		System.out.println("\nSetor: " + setor);
		System.out.println("\nFun��o: "+funcao);
		System.out.println("\nSal�rio: " + salario + " R$");
	}

	// get e set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}

package exercicioHerança;

	public class Animal {
	//atributos
	private String nome;
	private String idade;
	private String som;
	private String movimento;


	public Animal(String nome, String idade, String som, String movimento){
	//construtor
	super();
	this.nome = nome;
	this.idade = idade;
	this.som = som;
	this.movimento = movimento;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getMovimento() {
		return movimento;
	}
	public void setMovimento(String movimento) {
		this.movimento = movimento;
	}
	
}

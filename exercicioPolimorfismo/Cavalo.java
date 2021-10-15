package exercicioPolimorfismo;

public class Cavalo extends Animal {
	private String cor;
	private float peso;
	private String utilidade;
	
	public Cavalo(String nome,int idade,String cor,float peso,String util)
	{
		super(nome,idade);
		this.cor = cor;
		this.peso = peso;
		this.utilidade = util;
	}
	
	@Override //método polimorfico
	public void somEmitido(String som)
	{
		System.out.println("\nO cavalo está relinchando "+som);
	}
	
	@Override
	public void acao(String movimento)
	{
		System.out.println("\nO cavalo está "+movimento);
	}
	
	public void informaçãocavalo()
	{
		System.out.println("\nNome do cavalo: "+getNome());
		System.out.println("\nIdade: "+getIdade());
		System.out.println("\nCor do cavalo: "+cor);
		System.out.println("\nPeso: "+peso+"kg");
		System.out.println("\nEsse cavalo é de: "+utilidade);
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getUtilidade() {
		return utilidade;
	}

	public void setUtilidade(String utilidade) {
		this.utilidade = utilidade;
	}
}

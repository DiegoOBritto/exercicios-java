package exercicioHerança;

public class Cavalo extends Animal {
	// atributos
	private double altura;
	private double peso;
	private String cor;
	private String sexo;
	private String porte;
	private String raça;
	private String espécie;

	public Cavalo(String nome, String idade, String som, String movimento, double altura, double peso, String porte,
			String cor, String raça, String sexo, String espécie) {
		// construtor
		super(nome, idade, som, movimento);
		this.altura = altura;
		this.peso = peso;
		this.cor = cor;
		this.sexo = sexo;
		this.porte = porte;
		this.raça = raça;
		this.espécie = espécie;
	}

	// métodos
	public void informaçãocavalo() {
		System.out.println("\nEspécie do animal: " + getEspécie() + "\nNome do animal: " + getNome() + "\nSexo: "
				+ getSexo() + "\nRaça: " + getRaça() + "\nIdade: " + getIdade() + "\nPorte: " + getPorte() + "\nAltura: "
				+ getAltura() + "\nPeso: " + getPeso() + "\nAção: " + getMovimento() + "\nSom emitido: " + getSom());
	}

	// get e set
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getEspécie() {
		return espécie;
	}

	public void setEspécie(String espécie) {
		this.espécie = espécie;
	}

}

package exercicioHeran�a;

public class Cavalo extends Animal {
	// atributos
	private double altura;
	private double peso;
	private String cor;
	private String sexo;
	private String porte;
	private String ra�a;
	private String esp�cie;

	public Cavalo(String nome, String idade, String som, String movimento, double altura, double peso, String porte,
			String cor, String ra�a, String sexo, String esp�cie) {
		// construtor
		super(nome, idade, som, movimento);
		this.altura = altura;
		this.peso = peso;
		this.cor = cor;
		this.sexo = sexo;
		this.porte = porte;
		this.ra�a = ra�a;
		this.esp�cie = esp�cie;
	}

	// m�todos
	public void informa��ocavalo() {
		System.out.println("\nEsp�cie do animal: " + getEsp�cie() + "\nNome do animal: " + getNome() + "\nSexo: "
				+ getSexo() + "\nRa�a: " + getRa�a() + "\nIdade: " + getIdade() + "\nPorte: " + getPorte() + "\nAltura: "
				+ getAltura() + "\nPeso: " + getPeso() + "\nA��o: " + getMovimento() + "\nSom emitido: " + getSom());
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

	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public String getEsp�cie() {
		return esp�cie;
	}

	public void setEsp�cie(String esp�cie) {
		this.esp�cie = esp�cie;
	}

}

package exercicioHeran�a;

public class Pregui�a extends Animal {
	// atributos
	private String porte;
	private String cor;
	private String esp�cie;
	private String sexo;

	public Pregui�a(String nome, String idade, String som, String movimento, String porte, String cor, String esp�cie,
			String sexo) {
		// contrutor
		super(nome, idade, som, movimento);
		this.porte = porte;
		this.cor = cor;
		this.esp�cie = esp�cie;
		this.sexo = sexo;
	}

	// m�todos
	public void informa��opregui�a() {
		System.out.println("\nEsp�cie do animal: " + getEsp�cie() + "\nNome do animal: " + getNome() + "\nSexo: "
				+ getSexo() + "\nIdade: " + getIdade() + "\nPorte: " + getPorte() + "\nA��o: " + getMovimento()
				+ "\nSom emitido: " + getSom());
	}

	// get e set
	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getEsp�cie() {
		return esp�cie;
	}

	public void setEsp�cie(String esp�cie) {
		this.esp�cie = esp�cie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}

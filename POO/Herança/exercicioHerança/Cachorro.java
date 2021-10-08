package exercicioHeran�a;

public class Cachorro extends Animal {
	// atributos
	private String ra�a;
	private String porte;
	private String sexo;
	private String esp�cie;

	public Cachorro(String nome, String idade, String som, String movimento, String ra�a, String porte, String sexo,
			String esp�cie) {
		// construtor
		super(nome, idade, som, movimento);
		this.ra�a = ra�a;
		this.porte = porte;
		this.sexo = sexo;
		this.esp�cie = esp�cie;
	}

	// m�todos
	public void informa��ocachorro() {
		System.out.println("\nEsp�cie do animal: " + getEsp�cie() + "\nNome do animal: " + getNome() + "\nSexo: "
				+ getSexo() + "\nRa�a " + getRa�a() + "\nIdade: " + getIdade() + "\nPorte: " + getPorte() + "\nA��o: "
				+ getMovimento() + "\nSom emitido: " + getSom());
	}

	// get e set
	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEsp�cie() {
		return esp�cie;
	}

	public void setEsp�cie(String esp�cie) {
		this.esp�cie = esp�cie;
	}

}

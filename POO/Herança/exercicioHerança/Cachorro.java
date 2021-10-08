package exercicioHerança;

public class Cachorro extends Animal {
	// atributos
	private String raça;
	private String porte;
	private String sexo;
	private String espécie;

	public Cachorro(String nome, String idade, String som, String movimento, String raça, String porte, String sexo,
			String espécie) {
		// construtor
		super(nome, idade, som, movimento);
		this.raça = raça;
		this.porte = porte;
		this.sexo = sexo;
		this.espécie = espécie;
	}

	// métodos
	public void informaçãocachorro() {
		System.out.println("\nEspécie do animal: " + getEspécie() + "\nNome do animal: " + getNome() + "\nSexo: "
				+ getSexo() + "\nRaça " + getRaça() + "\nIdade: " + getIdade() + "\nPorte: " + getPorte() + "\nAção: "
				+ getMovimento() + "\nSom emitido: " + getSom());
	}

	// get e set
	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
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

	public String getEspécie() {
		return espécie;
	}

	public void setEspécie(String espécie) {
		this.espécie = espécie;
	}

}

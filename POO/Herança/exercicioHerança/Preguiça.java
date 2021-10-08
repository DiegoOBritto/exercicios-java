package exercicioHerança;

public class Preguiça extends Animal {
	// atributos
	private String porte;
	private String cor;
	private String espécie;
	private String sexo;

	public Preguiça(String nome, String idade, String som, String movimento, String porte, String cor, String espécie,
			String sexo) {
		// contrutor
		super(nome, idade, som, movimento);
		this.porte = porte;
		this.cor = cor;
		this.espécie = espécie;
		this.sexo = sexo;
	}

	// métodos
	public void informaçãopreguiça() {
		System.out.println("\nEspécie do animal: " + getEspécie() + "\nNome do animal: " + getNome() + "\nSexo: "
				+ getSexo() + "\nIdade: " + getIdade() + "\nPorte: " + getPorte() + "\nAção: " + getMovimento()
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

	public String getEspécie() {
		return espécie;
	}

	public void setEspécie(String espécie) {
		this.espécie = espécie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}

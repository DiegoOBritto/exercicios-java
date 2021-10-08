package IntroduçãoPOO;

public class classeAvião {
	// Atributos
		private String modelo;
		private String marca;
		private int ano;
		private double capacidade;
		private double velmax;

		// Construtor
		public classeAvião (String modelo, String marca, int ano, double capacidade, double velmax) 
		{
			this.modelo = modelo;
			this.marca = marca;
			this.ano = ano;
			this.capacidade = capacidade;
			this.velmax = velmax;		
		}
		public void print() {
			System.out.println("\nModelo do avião: "+modelo);
			System.out.println("\nMarca: "+marca);
			System.out.println("\nAno de fabricação: "+ano);
			System.out.println("\nCapacidade do avião: "+capacidade+" Kg");	
			System.out.println("\nVelocidade máxima: "+velmax+" km/h");
		}
		
		//Get e Set
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		public int getAno() {
			return ano;
		}
		public void setAno(int ano) {
			this.ano = ano;
		}
		public double getCapacidade() {
			return capacidade;
		}
		public void setCapacidade(double capacidade) {
			this.capacidade = capacidade;
		}
		public double getVelmax() {
			return velmax;
		}
		public void setVelmax(double velmax) {
			this.velmax = velmax;
		}
		
	
		

}

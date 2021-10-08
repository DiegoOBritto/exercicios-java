package Introdu��oPOO;

public class classeAvi�o {
	// Atributos
		private String modelo;
		private String marca;
		private int ano;
		private double capacidade;
		private double velmax;

		// Construtor
		public classeAvi�o (String modelo, String marca, int ano, double capacidade, double velmax) 
		{
			this.modelo = modelo;
			this.marca = marca;
			this.ano = ano;
			this.capacidade = capacidade;
			this.velmax = velmax;		
		}
		public void print() {
			System.out.println("\nModelo do avi�o: "+modelo);
			System.out.println("\nMarca: "+marca);
			System.out.println("\nAno de fabrica��o: "+ano);
			System.out.println("\nCapacidade do avi�o: "+capacidade+" Kg");	
			System.out.println("\nVelocidade m�xima: "+velmax+" km/h");
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

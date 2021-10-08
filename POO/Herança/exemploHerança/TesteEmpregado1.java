package exemploHerança;

public class TesteEmpregado1 {

	public static void main(String[] args) {

		Empregado1 diego = new Empregado1("Diego Oliveira","Avenida São Paulo,99",
				"33555667876",948484848,21,322,10000,15);
		diego.imprimirInfo();
		diego.calcularSalario();
	}

}
package exercicioHeran�a;

public class testeAnimais {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Luna", "4", "Latido", "Correr", "Sem Ra�a Definida", "M�dio", "F�mea",
				"Cachorro");
		
		Cavalo cavalo = new Cavalo("Mancha", "7", "Relincho", "Correr/Trotar", 1.55, 470.00, "Grande", "Branco/Marrom",
				"Manga-Larga Marchador", "Macho", "Cavalo");
		
		Pregui�a pregui�a = new Pregui�a ("Soneca", "2", "Som desconhecido", "Subir em �rvores", "M�dio", "Cinza", "Pregui�a", "Macho");
		
		
		cavalo.informa��ocavalo();
		System.out.println("----------------------------------------------");
		cachorro.informa��ocachorro();
		System.out.println("----------------------------------------------");
		pregui�a.informa��opregui�a();
	}

}

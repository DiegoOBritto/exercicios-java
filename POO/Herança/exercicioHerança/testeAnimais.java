package exercicioHerança;

public class testeAnimais {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Luna", "4", "Latido", "Correr", "Sem Raça Definida", "Médio", "Fêmea",
				"Cachorro");
		
		Cavalo cavalo = new Cavalo("Mancha", "7", "Relincho", "Correr/Trotar", 1.55, 470.00, "Grande", "Branco/Marrom",
				"Manga-Larga Marchador", "Macho", "Cavalo");
		
		Preguiça preguiça = new Preguiça ("Soneca", "2", "Som desconhecido", "Subir em árvores", "Médio", "Cinza", "Preguiça", "Macho");
		
		
		cavalo.informaçãocavalo();
		System.out.println("----------------------------------------------");
		cachorro.informaçãocachorro();
		System.out.println("----------------------------------------------");
		preguiça.informaçãopreguiça();
	}

}

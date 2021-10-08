package IntroduçãoPOO;

public class testeAvião {

	public static void main(String[] args) {
	
		classeAvião avião = new classeAvião ("AN-225 Mriya", "Antonov", 1988, 250.000, 850.00);
		
		System.out.println("---------INFORMAÇÕES DO AVIÃO---------");
		avião.print();
		/*System.out.println(avião.getMarca());
		System.out.println(avião.getModelo());
		System.out.println(avião.getAno());
		System.out.println(avião.getCapacidade());
		System.out.println(avião.getVelmax());*/
		System.out.println("--------------------------------------");
	}

}

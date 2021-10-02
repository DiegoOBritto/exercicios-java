package ExerciciosIntrodução;

import java.util.Scanner;

public class anosEmDias {

	public static void main(String[] args) {
		
		int totaldias, anos, meses, dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o total de dias vividos: ");
		totaldias = leia.nextInt();
		
		anos = totaldias / 365;
		meses = (totaldias % 365) / 30;
		dias = (totaldias % 365) % 30;
		
		System.out.println("Eu tenho " + anos + "ano(s), " + meses + "meses, " + dias + "dias...");
		
			
		
	}

}

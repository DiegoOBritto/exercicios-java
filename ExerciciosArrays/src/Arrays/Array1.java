package Arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		float media[]=new float[4];
		int x;
		float n1, n2, n3, somamedia=0, mediageral;
		
		Scanner leia = new Scanner (System.in);
		
		for (x=0;x<4;x++) {
			System.out.println("\n3Digite a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nDigite a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nDigite a terceira nota: ");
			n3 = leia.nextFloat();
			
			media[x] = (n1+n2+n3)/3;
			
			System.out.printf("\nMédia aluno %d: %2.2f ",x+1,media[x]);
			
			somamedia+=media[x];
			
			
		}
		mediageral = somamedia / 4;
		System.out.printf("\nMédia geral: %2.2f ",mediageral);
	}

}

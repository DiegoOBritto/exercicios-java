package La�osRepeti��o;

import java.util.Scanner;

public class exercicioDoWhile {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
		 * igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		int num, soma=0, cont;
		
		Scanner leia = new Scanner (System.in);
		
		/*System.out.println("Digite um n�mero: ");
		num = leia.nextInt();*/
		
		do {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			soma = soma + num;
			 
			System.out.println("A soma de todos os n�meros digitados �: "+soma+"\n");
		 } while (num != 0);

	}

}

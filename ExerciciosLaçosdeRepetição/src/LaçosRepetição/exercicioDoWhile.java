package LaçosRepetição;

import java.util.Scanner;

public class exercicioDoWhile {

	public static void main(String[] args) {
		/*
		 * Crie um programa que leia um número do teclado até que encontre um número
		 * igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)
		 */
		int num, soma=0, cont;
		
		Scanner leia = new Scanner (System.in);
		
		/*System.out.println("Digite um número: ");
		num = leia.nextInt();*/
		
		do {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			soma = soma + num;
			 
			System.out.println("A soma de todos os números digitados é: "+soma+"\n");
		 } while (num != 0);

	}

}

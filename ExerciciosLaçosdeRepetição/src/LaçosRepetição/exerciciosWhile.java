package LaçosRepetição;

import java.util.Scanner;

public class exerciciosWhile {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. WHILE
		 */
		int cont21 = 0, cont50 = 0, idade;

		Scanner leia = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();

		while (idade != -99) {
			System.out.printf("\nSua idade é: %d " ,idade,"\n");
			if (idade < 21) {
				cont21 = cont21 + 1;
			} else if (idade >= 50) {
				cont50 = cont50 + 1;
			}
			System.out.printf("\nDigite sua idade: " );
			idade = leia.nextInt();

		}
		System.out.printf("\nTotal de pessoas com menos de 21 anos: %d", cont21);
		System.out.printf("\nTotal de pessoas com mais de 50 anos: %d", cont50);

	}

}

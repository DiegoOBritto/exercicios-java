package Arrays;

import java.util.Scanner;

public class exercicioVetorArray {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba 6 n�meros inteiros e mostre: � Os n�meros pares
		 * digitados; � A soma dos n�meros pares digitados; � Os n�meros �mpares
		 * digitados; � A quantidade de n�meros �mpares digitados.
		 */
		int num[] = new int[6];
		int contpar = 0, contimpar = 0, somapar = 0, somaimpar = 0, cont;

		Scanner leia = new Scanner(System.in);

		for (cont = 0; cont < 6; cont++) {
			System.out.print("\nDigite um n�mero: ");
			num[cont] = leia.nextInt();

		}
		for (cont = 0; cont < 6; cont++) {
			System.out.println("\nN�mero " + cont + ": " + num[cont]);

			if (num[cont] % 2 == 0) {
				somapar = somapar + num[cont];
				contpar = contpar + 1;

			} else {
				contimpar = contimpar + 1;
				somaimpar = somaimpar + num[cont];
			}

		}
		System.out.println("\nOs n�meros pares digitados foram: " + contpar);
		System.out.println("\nA soma dos n�meros pares digitados �: " + somapar);
		System.out.println("\nOs n�meros �mpares digitados foram: " + contimpar);
		System.out.println("\nA soma dos n�meros �mpares digitados �: " + somaimpar);

	}
}

package Arrays;

import java.util.Scanner;

public class exercicioVetorArray {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba 6 números inteiros e mostre: • Os números pares
		 * digitados; • A soma dos números pares digitados; • Os números ímpares
		 * digitados; • A quantidade de números ímpares digitados.
		 */
		int num[] = new int[6];
		int contpar = 0, contimpar = 0, somapar = 0, somaimpar = 0, cont;

		Scanner leia = new Scanner(System.in);

		for (cont = 0; cont < 6; cont++) {
			System.out.print("\nDigite um número: ");
			num[cont] = leia.nextInt();

		}
		for (cont = 0; cont < 6; cont++) {
			System.out.println("\nNúmero " + cont + ": " + num[cont]);

			if (num[cont] % 2 == 0) {
				somapar = somapar + num[cont];
				contpar = contpar + 1;

			} else {
				contimpar = contimpar + 1;
				somaimpar = somaimpar + num[cont];
			}

		}
		System.out.println("\nOs números pares digitados foram: " + contpar);
		System.out.println("\nA soma dos números pares digitados é: " + somapar);
		System.out.println("\nOs números ímpares digitados foram: " + contimpar);
		System.out.println("\nA soma dos números ímpares digitados é: " + somaimpar);

	}
}

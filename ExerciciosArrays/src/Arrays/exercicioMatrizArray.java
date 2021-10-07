package Arrays;

import java.util.Scanner;

public class exercicioMatrizArray {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao
		 * usuário um menu de opções: (1) somar as duas matrizes (2) subtrair a primeira
		 * matriz da segunda (3) adicionar uma constante as duas matrizes (4) imprimir
		 * as matrizes Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser
		 * criada. Na terceira opção o valor da constante deve ser lido e o resultado da
		 * adição da constante deve ser armazenado na própria matriz.
		 */

		float matriz1[][] = new float[2][2];
		float matriz2[][] = new float[2][2];
		float matriz3[][] = new float[2][2];
		int a, b, op, num;

		Scanner leia = new Scanner(System.in);

		for (a = 0; a < 2; a++) {
			for (b = 0; b < 2; b++) {
				System.out.println("\nEntre com o valor da matriz 1: ");
				matriz1[a][b] = leia.nextFloat();
				System.out.println("\nEntre com o valor da matriz 2: ");
				matriz2[a][b] = leia.nextFloat();
			}
		}

		System.out.println("\n\t\tMenu de opções");
		System.out.println("\n1- Somar as duas matrizes");
		System.out.println("\n2- Subtrair a primeira matriz da segunda ");
		System.out.println("\n3- Adicionar uma variável as duas matrizes");
		System.out.println("\n4- Imprimir as matrizes");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		while (op < 1 || op > 4) {
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1- Somar as duas matrizes");
			System.out.println("\n2- Subtrair a primeira matriz da segunda ");
			System.out.println("\n3- Adicionar uma variável as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\nDigite sua opção novamente: ");
			op = leia.nextInt();
		}
		do {
			switch (op) {
			case 1:
				for (a = 0; a < 2; a++) {
					for (b = 0; b < 2; b++) {
						matriz3[a][b] = matriz1[a][b] + matriz2[a][b];
						System.out.println("\nSoma: " + matriz3[a][b]);
					}
				}
				break;
			case 2:
				for (a = 0; a < 2; a++) {
					for (b = 0; b < 2; b++) {
						matriz3[a][b] = matriz2[a][b] - matriz1[a][b];
						System.out.println("\nDiferença: " + matriz3[a][b]);
					}
				}
				break;
			case 3:
				System.out.println("\nEntre com um número: ");
				num = leia.nextInt();
				for (b = 0; b < 2; b++) {
					for (b = 0; b < 2; b++) {
						matriz1[a][b] += num;
						matriz2[a][b] += num;
						System.out.println("\nMatriz1: " + matriz1[a][b]);
						System.out.println("\nMatriz2: " + matriz2[a][b]);
					}
				}
				break;
			case 4:
				for (a = 0; a < 2; a++) {
					for (b = 0; b < 2; b++) {

						System.out.println("\nMatriz1: " + matriz1[a][b]);
						System.out.println("\nMatriz2: " + matriz2[a][b]);
					}
				}
				break;
			default:
				System.out.println("\nOpção inválida");
			}
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n1- Somar as duas matrizes");
			System.out.println("\n2- Subtrair a primeira matriz da segunda ");
			System.out.println("\n3- Adicionar uma variável as duas matrizes");
			System.out.println("\n4- Imprimir as matrizes");
			System.out.println("\n0- Sair do programa");
			System.out.println("\nDigite sua opção: ");
			op = leia.nextInt();
		} while (op != 0);

	}

}

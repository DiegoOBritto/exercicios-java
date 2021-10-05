package LaçosRepetição;

import java.util.Scanner;

public class exerciciosPareseImpares {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, cont, numpar = 0, numimpar = 0;

		for (cont = 1; cont <= 10; cont++) {
			System.out.printf("%d", cont);

			System.out.print("º número: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				numpar++;
			} else {
				numimpar++;
			}

		}
		System.out.println("A quantidade de números pares é: " + numpar);
		System.out.println("A quantidade de números ímpares é: " + numimpar);

	}

}

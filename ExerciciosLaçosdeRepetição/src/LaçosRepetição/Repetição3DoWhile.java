package La�osRepeti��o;

import java.util.Scanner;

public class Repeti��o3DoWhile {

	public static void main(String[] args) {

		int idade;

		Scanner leia = new Scanner(System.in);

		System.out.printf("\nDigite sua idade: ");
		idade = leia.nextInt();

		do {
			System.out.printf("\nSua idade �: %d", idade);
			if (idade >= 18) {
				System.out.printf("\nVoc� � maior de idade...");
			} else {
				System.out.printf("\nVoc� � menor de idade...");
			}
			System.out.printf("\nDigite sua idade: ");
			idade = leia.nextInt();

		} while (idade >= 1);

	}
}

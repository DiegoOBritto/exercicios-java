package LaçosRepetição;

import java.util.Scanner;

public class Repetição2While {

	public static void main(String[] args) {

		int idade;

		Scanner leia = new Scanner(System.in);

		System.out.printf("Digite sua idade: ");
		idade = leia.nextInt();

		while (idade >= 1) {
			System.out.printf("Sua idade é: %d", idade);
			if (idade >= 18) {
				System.out.printf("\nVocê é maior de idade...");
			} else {
				System.out.printf("\nVocê é menor de idade...");
			}
			System.out.printf("\nDigite sua idade: ");
			idade = leia.nextInt();

		}
	}

}

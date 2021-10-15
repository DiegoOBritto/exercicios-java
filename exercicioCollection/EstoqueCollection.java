package exercicioCollection;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueCollection {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		ArrayList<String> estoque = new ArrayList();
		int op;

		System.out.println("\n\t\t______________________________");
		System.out.println("\n\t\t\tESTOQUE DA LOJA");
		System.out.println("\n\t\t______________________________");

		do {
			System.out.println("\n_________________________________________________________");
			System.out.println("\n1- Deseja armazenar produtos ao estoque?");
			System.out.println("\n2- Deseja remover produtos do estoque?");
			System.out.println("\n3- Deseja atualizar produtos do estoque?");
			System.out.println("\n4- Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n0- Deseja sair do programa?");
			System.out.println("\n_________________________________________________________");
			System.out.println("\nPor favor, digite sua opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para armazenar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				System.out.println(
						"\nTem certeza que deseja mesmo remover este ítem?\nDigite 'S' para Sim ou 'N' para Não: ");
				char usuario = leia.next().charAt(0);
				if (usuario == 'S') {
					if (produtor.contains(produtor)) {
						estoque.remove(produtor);
					} else {
						System.out.println("Produto não encontrado no estoque!");
					}
				} else if (usuario == 'N') {
					System.out.println("\nTudo bem, este ítem não será removido!");
				}

				break;
			case 3:
				leia.nextLine();
				System.out.println("\nAgora, digite o nome do produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do novo produto: ");
				String novo = leia.nextLine();
				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("Produto não encontrado no estoque!");
				}
				break;
			case 4:
				leia.nextLine();
				System.out.println("\n\t\t______________________________");
				System.out.println("\n\t\t\tESTOQUE DA LOJA");
				System.out.println("\n\t\t______________________________\n\n");
				System.out.println(estoque);
				break;
			}

		} while (op != 0);

	}

}

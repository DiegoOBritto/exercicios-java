package ExerciciosIntrodução;

import java.util.Scanner;

public class mediaPonderada {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, media;
		int peso1=2, peso2=3, peso3=5;
		String nome;
		
		Scanner leia = new Scanner (System.in);

		System.out.println("\nEscreva seu nome: ");
		nome = leia.next();
		
		System.out.println("\nDigite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1 + peso2 + peso3) ;
		
		System.out.println("\nA nota média do aluno: " + nome + " é: " + media);
	}

}

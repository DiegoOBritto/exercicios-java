package Decisão;

import java.util.Scanner;

public class Decisão1 {

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tMenu de opções...");
		System.out.println("\n1- Você é muito gentil...");
		System.out.println("\n2- Você é muito persistente...");
		System.out.println("\n3- Você é muito resiliente...");
		System.out.println("\n4- Você é muito dedicade...");
		System.out.println("\nDigite uma opção: ");
		op = leia.nextInt();
		
		switch(op)
		{
		case 1:
			System.out.println("\nVocê é muito gentil...");
			break;
		case 2:
			System.out.println("\nVocê é muito persistente...");
			break;
		case 3:
			System.out.println("\nVocê é muito resiliente...");
			break;
		case 4:
			System.out.println("\nVocê é muito dedicade...");
			break;
			default:
				System.out.println("\nOpção inválida!!!");
		}
	}

}
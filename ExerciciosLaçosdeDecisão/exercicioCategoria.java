package Decisão;

import java.util.Scanner;

public class exercicioCategoria {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		
		
		if (idade>=10 && idade<=14) 
		{
			System.out.print(nome+ ", sua categoria é Infantil !!!");
		}
		else if(idade>=15 && idade <=17)
		{
			System.out.print(nome+ ", sua categoria é Juvenil !!!");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.print(nome+ ", sua categoria é Adulto !!!");
		}
		else if(idade<10)
		{
		System.out.print("Idade abaixo do permitido !!! ");	
		}
		else if(idade>25)
		{
		System.out.print("Idade acima do permitido !!! ");
		}
	}

}

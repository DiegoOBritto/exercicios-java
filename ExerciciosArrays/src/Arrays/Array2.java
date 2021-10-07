package Arrays;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		
		int num[][] = new int [2][3];
		int linha, coluna;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++) 
		{
			for (coluna=0;coluna<3;coluna++) 
			{
				System.out.print("Digite um número: ");
				num [linha][coluna] = leia.nextInt();			
				}
		}
		for(linha=0;linha<2;linha++) 
		{
			for (coluna=0;coluna<3;coluna++) 
			{
				if (num[linha][coluna] % 2 == 0)
				{
					System.out.println("Esse número é par --> "+num[linha][coluna]);
				} else {
					System.out.println("Esse número é ímpar --> "+num[linha][coluna]);
				}
					
					
		}

	}

}
}
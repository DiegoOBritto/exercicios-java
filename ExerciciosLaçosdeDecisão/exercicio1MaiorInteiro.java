package Decisão;

import java.util.Scanner;

public class exercicio1MaiorInteiro {

	public static void main(String[] args) {
		
		int n1, n2, n3, maiorNum ;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo número: ");
		n2 = leia.nextInt();
		System.out.print("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		maiorNum=0;
		
		if (n1>n2 && n1>n3)
		{
			maiorNum = n1;
		}
		else if (n2>maiorNum && n2>n3)
		{
			maiorNum = n2;
		}
		else {
		
			maiorNum = n3;
		}
		
		System.out.println("O maior número entre os três é: "+maiorNum);
		
	}

}

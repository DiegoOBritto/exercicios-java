package Decis�o;

import java.util.Scanner;

public class exercicio1MaiorInteiro {

	public static void main(String[] args) {
		
		int n1, n2, n3, maiorNum ;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
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
		
		System.out.println("O maior n�mero entre os tr�s �: "+maiorNum);
		
	}

}

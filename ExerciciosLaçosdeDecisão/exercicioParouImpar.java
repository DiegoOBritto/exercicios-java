package Decis�o;

import java.util.Scanner;
import java.math.*;

public class exercicioParouImpar {

	public static void main(String[] args) {
		
		
		
		double par, impar, num;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
		
		if(num % 2 ==0) 
		{
			par = Math.sqrt(num);
			System.out.print("A ra�z quadrada do n�mero digitado �: "+par);
		}
		else 
		{
			impar = Math.pow(num, 2);
			System.out.print("O n�mero digitado elevado ao quadrado �: "+impar);
		}
		
		
		
	}

}

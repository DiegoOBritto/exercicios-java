package Decisão;

import java.util.Scanner;
import java.math.*;

public class exercicioParouImpar {

	public static void main(String[] args) {
		
		
		
		double par, impar, num;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		if(num % 2 ==0) 
		{
			par = Math.sqrt(num);
			System.out.print("A raíz quadrada do número digitado é: "+par);
		}
		else 
		{
			impar = Math.pow(num, 2);
			System.out.print("O número digitado elevado ao quadrado é: "+impar);
		}
		
		
		
	}

}

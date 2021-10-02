package ExerciciosIntrodução;

import java.util.Scanner;
import java.math.*;

public class expressaoABC {
	
	public static void main (String[] args) {
		
		float a, b, c, r, s, d;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de C: ");
		c = leia.nextInt();
		
		r = (a + b);
		r = r*r;
		System.out.println("O valor de R é: " + r);
		
		s = (b + c);
		s = s*s;
		System.out.println("O valor de S é: " + s);
		
		d = (r + s) / 2;
		
		System.out.print("\nO valor final da expressão é: " + d);
		
		
		
		
		
		
		
	}
	
		

}

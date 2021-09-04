package categoria3;

import java.util.Scanner;

import categoria3.Minnumbers.Minimum;

public class Soma {
 
	interface Somatorio{
		int soma(int a, int b);
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type the first value:");
		int a = var.nextInt();
		System.out.println("Type the second value:");
		int b = var.nextInt();
		Somatorio soma1 = (x,y) -> (x+y); 
		System.out.println(soma1.soma(a, b));		
		var.close();
	}
}

package categoria3;

import java.util.Scanner;

public class Min {
 
	interface Minimum{
		int min(int a, int b);
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type the first value:");
		int a = var.nextInt();
		System.out.println("Type the second value:");
		int b = var.nextInt();
		Minimum min1 = (x,y) -> {if (x < y) return x; else return y; };
		System.out.println(min1.min(a, b));		
		var.close();
	}
	
}

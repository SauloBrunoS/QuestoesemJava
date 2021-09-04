package categoria3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import categoria3.Min.Minimum;

public class Iguais {

	interface Equal{
		int eq(int a, int b, int c);
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type the first value:");
		int a = var.nextInt();
		System.out.println("Type the second value:");
		int b = var.nextInt();
		System.out.println("Type the third value:");
		int c = var.nextInt();
		Equal eq1 = (x,y,z) -> {if (x == y && y == z) return 3; else if(x == y || y == z || x ==z ) return 2; else return 0;};
		System.out.println(eq1.eq(a, b, c));		
		var.close();
	}
	
}

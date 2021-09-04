package categoria4;

import java.util.Scanner;

public class Maxtnumbers {
	interface Maximum{
		int max(int a, int b, int c);
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type the first value:");
		int a = var.nextInt();
		System.out.println("Type the second value:");
		int b = var.nextInt();
		System.out.println("Type the third value:");
		int c = var.nextInt();
		Maximum maxe = (x,y,z) -> {if (x >= y && x >= z) return x; else if(y>=z) return y; else return z;};
		System.out.println(maxe.max(a, b, c));		
		var.close();
	}
	
	}


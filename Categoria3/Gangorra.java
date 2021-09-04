package categoria3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import categoria3.Minnumbers.Minimum;
public class Gangorra {
	interface Equilibrio{
		int eq(int a, int b, int c, int d);
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Digite o peso da criança e o comprimento do lado esquerdo:");
		int a = var.nextInt();
		int b = var.nextInt();
		System.out.println("Digite o peso da criança e o comprimento do lado direito:");
		int c = var.nextInt();
		int d = var.nextInt();
		Equilibrio eq1 = (w,x,y,z) -> {if (w*x == y*z) return 0; else if(w*x > y*z) return -1; else return 1;};
		System.out.println(eq1.eq(a, b, c, d));		
		var.close();
	}

}

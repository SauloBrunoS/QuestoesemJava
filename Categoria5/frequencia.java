package category5;

import java.util.ArrayList;
import java.util.Scanner;
public class frequencia {
	  public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type a number");
		int n = var.nextInt();
		System.out.println("Lista");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
        numbers.add(var.nextInt());
		}
		Integer result = numbers.stream().reduce(0, (sum, element) -> {if(element == n) return sum+1; else return sum;});
		System.out.println(result);
		var.close();
	  }
	}




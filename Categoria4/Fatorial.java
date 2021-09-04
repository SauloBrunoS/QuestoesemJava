package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int n = var.nextInt();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = n; i > 0; i--) {
			numbers.add(i);
		}
		
		Integer result = numbers.stream().reduce(1, (fat, elem) -> fat * elem);
		
		System.out.println(result);
		var.close();
	}
}

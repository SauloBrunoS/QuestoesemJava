package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaImpares {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers.add(var.nextInt());
		}
		Integer sumodd = numbers.stream().reduce(0, (sum, elemento) -> {if (elemento % 2 == 1) return sum + elemento; else return sum;});
		System.out.println(sumodd);
		var.close();
	}
}

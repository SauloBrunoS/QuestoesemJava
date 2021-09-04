package categoria4;

import java.util.Scanner;
import java.util.ArrayList;

public class maximo {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers.add(var.nextInt());
		}
		Integer max = numbers.stream().reduce(numbers.get(0), (maior, elemento) -> {if (maior > elemento) return maior; else return elemento;});
		System.out.println(max);
		var.close();
	}


}

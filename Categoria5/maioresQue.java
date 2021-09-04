package category5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class maioresQue {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type a number");
		int n = var.nextInt();
		
		System.out.println("Lista");

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
		numbers.add(var.nextInt());
		}
		List <Integer> result = numbers.stream().filter((Integer a) -> a > n).collect(Collectors.toList());
		System.out.println(result);
		var.close();
	}
}

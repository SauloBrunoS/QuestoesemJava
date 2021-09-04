package category5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class removerMaior {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers.add(var.nextInt());
		}
		
		Integer max = numbers.stream().reduce(numbers.get(0), (maior, elem) -> {if (elem > maior) return elem; else return maior;});
		List <Integer> newlist = numbers.stream().filter((Integer a) -> a != max).collect(Collectors.toList());
		System.out.println(Arrays.toString(newlist.toArray()));
		var.close();
	}
}

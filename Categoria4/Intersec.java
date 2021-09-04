package categoria4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intersec {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers.add(var.nextInt());
		}
		var.next();
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers2.add(var.nextInt());
		}
	List<Integer> newList = numbers.stream().filter((Integer a) -> numbers2.contains(a)).collect(Collectors.toList());
	
	System.out.println(Arrays.toString(newList.toArray()));

	var.close();
}
}

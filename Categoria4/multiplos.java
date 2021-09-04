package categoria4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class multiplos {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Type a number");
		int n = var.nextInt();
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 1; i < n; i++) {
        numbers.add(i);
		}
		Integer result = numbers.stream().reduce(0, (sum, element) -> {if(element % 3 == 0 || element %5 == 0) return sum+element; else return sum;});
		System.out.println(result);
		var.close();
		
	}
}

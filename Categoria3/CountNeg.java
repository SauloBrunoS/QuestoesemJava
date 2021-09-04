package categoria3;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class CountNeg {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers.add(var.nextInt());
		}
		int negativenumbers = numbers.stream().filter((Integer a) -> a < 0).reduce(0, (qtd, elem) -> qtd + 1);
        System.out.println(negativenumbers);
		var.close();
	}

}

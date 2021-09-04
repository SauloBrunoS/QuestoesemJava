package categoria3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Final {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Digite a quantidade de elementos finais:");
		int nf = var.nextInt();
		System.out.println("Agora a lista:");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers.add(var.nextInt());
		}
		List<Integer> newlist = numbers.stream().filter((Integer a) -> numbers.indexOf(a) >= (numbers.size()-nf)).collect(Collectors.toList());
		System.out.println(Arrays.toString(newlist.toArray()));
		var.close();
	}
}

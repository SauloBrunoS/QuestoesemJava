package categoria4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Pertence {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int n = var.nextInt();
		System.out.println("Agora a lista:");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers.add(var.nextInt());
		}
		List<Integer> newlist = numbers.stream().filter((Integer a) -> a == n).collect(Collectors.toList());
		if(newlist.isEmpty()) System.out.println("false");
		else System.out.println("true");;
		var.close();
	}
}

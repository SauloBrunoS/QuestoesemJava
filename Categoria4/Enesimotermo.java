package categoria4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Enesimotermo {

	public static void main(String[] args) {
		
		Scanner var = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int n = var.nextInt();
		System.out.println("Agora a lista:");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers.add(var.nextInt());
		}
		int termo;
		if(n >= 0) {
		termo = numbers.stream().reduce(numbers.get(0), (elemq, elem) -> {if(elem == numbers.get(n)) return elem; else return elemq;});
		}
		else {
		termo = numbers.stream().reduce(numbers.get(0), (elemq, elem) -> {if(elem == numbers.get(n+numbers.size())) return elem; else return elemq;});
		}			
		System.out.println(termo);
		var.close();
		
		
	}
}

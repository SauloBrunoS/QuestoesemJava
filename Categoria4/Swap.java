package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	System.out.println("Type the indexes");
	int n = var.nextInt();
	int n2 = var.nextInt();
	
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	while(var.hasNextInt()) {
		numbers.add(var.nextInt());
	}
	Integer result = numbers.stream().map((Integer a) -> a == )
	System.out.println(result);
	var.close();
	}
}

package categoria4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class total {
		public static void main(String[] args) {
			Scanner var = new Scanner(System.in);
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			while(var.hasNextInt()) {
				numbers.add(var.nextInt());
			}
			Integer sum = numbers.stream().map((Integer a) -> 1).mapToInt(Integer:: intValue).sum();
			System.out.println(sum);
			var.close();
		}
}

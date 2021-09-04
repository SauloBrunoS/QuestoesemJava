package categoria3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Interior {
	
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		while(var.hasNextInt()) {
			numbers.add(var.nextInt());
		}
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for(int i = 1; i < numbers.size()-1; i++) {
        indexes.add(i);
		}
		List<Integer> newlist = indexes.stream().map((Integer a) -> numbers.get(a)).collect(Collectors.toList());
		System.out.println(Arrays.toString(newlist.toArray()));
		var.close();
	}
	}

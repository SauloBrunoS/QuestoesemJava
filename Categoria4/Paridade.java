package categoria4;

import java.util.ArrayList;
import java.util.Scanner;

public class Paridade {
	public static boolean paridade(ArrayList<Boolean> l) {
		int counter = 0;
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i))
				counter++;
		}
		if(counter % 2 == 1) return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		ArrayList<Boolean> booleanvalues = new ArrayList<Boolean>();
		while(var.hasNextBoolean()) {
			booleanvalues.add(var.nextBoolean());
		}
		boolean result = booleanvalues.stream().reduce(false, (value, elemento) -> {if (value == false && elemento == true) return true; else if(value == true && elemento == true) return false; else return value ;});
		System.out.println(result);
		var.close();
		
	}
}

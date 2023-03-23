import java.lang.*;
import java.util.*;

class program207 {
	public static void main(String args[]) {
		
		ArrayList<Integer>numbers = new ArrayList<>();
		
		
		numbers.add(4);
		numbers.add(3);
		numbers.add(2);
		
		System.out.println("\n\tUnsorted ArrayList : "+numbers);
		
		Collections.sort(numbers);
		System.out.println("\n\tSorted ArrayList : "+numbers);
		
	}
}
import java.lang.*;
import java.util.*;

class Number {
	
	public int no;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Eter the number : ");
		no = sobj.nextInt();
	}
	public void Display() {
		
		for(int i = 1 ; i <= no ; i++){
			System.out.println(i);
		}
	}
}
class program140 {
	public static void main(String args[]) {
		
		Number nobj = new Number();
		nobj.Accept();
		nobj.Display();
	}
}
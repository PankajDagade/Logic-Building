import java.lang.*;
import java.util.*;

class StringBreak {
	
	public String str;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println();
		System.out.print("\tEnter the String : ");
		str = sobj.nextLine();
	}
	public void Display() {
		
		String Arr[] = str.split(" ");
		
		System.out.println();
		System.out.println("\tNumber of words are : "+Arr.length);
	}
}
class program193 {
	public static void main(String args[]) {
		
		StringBreak sobj = new StringBreak();
		sobj.Accept();
		sobj.Display();
	}
}
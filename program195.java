import java.lang.*;
import java.util.*;

class Replace {
	
	public String str;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\tEnter the String : ");
		 str = sobj.nextLine();
	}
	public void Display() {
		
		String Arr = str.replace("is","was");
		
		
		System.out.println("\n\t"+Arr);
	}
}
class program195 {
	public static void main(String args[]) {
		
		Replace obj = new Replace();
		obj.Accept();
		obj.Display();
	}
}
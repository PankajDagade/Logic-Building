import java.lang.*;
import java.util.*;

class StringX {
	
	String str;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		str = sobj.nextLine();
	}
	public void Display() {
		
		String Arr[] = str.split(" ");
		
		for(String words : Arr){
			System.out.println(words);
		}
	}
}
class program194 {
	public static void main(String args[]) {
		
		StringX obj = new StringX();
		obj.Accept();
		obj.Display();
	}
}
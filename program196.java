import java.lang.*;
import java.util.*;

class Trim {
	
	public String str;
	
	public void Accept() {
		
		str = "     Pankaj is good boy";
		System.out.println("\n"+str);
	}
	public void Display() {
		
		String Arr = str.trim();
		
		System.out.println("\n"+Arr);
	}
}
class program196 {
	public static void main(String args[]) {
		
		Trim obj = new Trim();
		obj.Accept();
		obj.Display();
	}
}
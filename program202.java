import java.lang.*;
import java.util.*;

class Strings {
	
	public String str;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\n\tEnter the String : ");
		str = sobj.nextLine();
	}
	public void Display() {
		
		String newstr = str.replaceAll("[^A-Z a-z]","");
		String newstr1 = newstr.trim();
		String Arr[] = newstr1.split(" ");
		
		StringBuffer finalstr = new StringBuffer();
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			StringBuffer sb = new StringBuffer(Arr[iCnt]);
			finalstr.append((sb.reverse()).append(" "));
		}
		String finalstr2 = new String(finalstr);
		System.out.println("\n\tReverse is : "+finalstr2.trim());
		
		
	}
}
class program202 {
	public static void main(String args[]) {
		
		Strings obj = new Strings();
		obj.Accept();
		obj.Display();
	}
}
/* Accept one character from user and convert case of that character */

import java.lang.*;
import java.util.*;

class ConvertcaseC {
	
	public char ch = '\0';
	public char ch2 = '\0';
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the character : ");
		ch = sobj.next().charAt(0);
	}
	public void Display() {
		
		if(ch >= 'A' && ch <= 'Z'){
			ch2 = Character.toLowerCase(ch);
		    System.out.println("LowerCase : "+ch2);
		}else{
			ch2 = Character.toUpperCase(ch);
		    System.out.println("UpperCase : "+ch2);
        }			
	}
}
class program156 {
	public static void main(String args[]) {
		
		ConvertcaseC cobj = new ConvertcaseC();
		cobj.Accept();
		cobj.Display();
	}
}
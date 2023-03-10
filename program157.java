/* Accept one character from user and check whether that character is vowel or Not */

import java.lang.*;
import java.util.*;

class VowelorNot {
	
	public char ch = '\0';
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the character : ");
		ch = sobj.next().charAt(0);
	}
	public void Display(){
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			System.out.println(" "+ch+" character is vowel");
		}else{
			System.out.println(" "+ch+" character is not vowel");
		}
	}
}
class program157 {
	public static void main(String args[]) {
		
		VowelorNot vobj = new VowelorNot();
		vobj.Accept();
		vobj.Display();
	}
}
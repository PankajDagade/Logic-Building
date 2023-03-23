import java.lang.*;
import java.util.*;

class TestString {
	
	public String str;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("\nEnter the String : ");
		str = sobj.nextLine();
	}
	public void charTest() {
		
		char Arr[] = str.toCharArray();
		
		System.out.println();
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			System.out.println(Arr[iCnt]);
		}
	}
}
class program191 {
	public static void main(String args[]) {
		
		TestString tobj = new TestString();
		tobj.Accept();
		tobj.charTest();
		

	}
}
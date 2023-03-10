/* Accept two number from user and Display first number in second number of times*/

import java.lang.*;
import java.util.*;

class Number {
	
	public int iNo = 0;
	public int iFreq = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		iNo = sobj.nextInt();
		System.out.print("Enter the iFrequency : ");
		iFreq = sobj.nextInt();
	}
	public void Display() {
		
		for(int i = 1 ; i <= iFreq ; i++)
			System.out.print(iNo+"  ");
	}
}
class program154 {
	public static void main(String args[]) {
		
		Number nobj = new Number();
		nobj.Accept();
		nobj.Display();
		
	}
}
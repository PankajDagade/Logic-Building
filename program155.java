/*  Accept number from user and check whether number is even or odd */

import java.lang.*;
import java.util.*;

class EvenorOdd {
	
	public int iNo = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public void Display() {
		
		if( (iNo % 2) == 0)
			System.out.println(iNo+" is a even number");
		else
			System.out.println(iNo+" is a odd number");
	}
}
class program155 {
	public static void main(String args[]) {
		
		EvenorOdd obj = new EvenorOdd();
		obj.Accept();
		obj.Display();
	}
}
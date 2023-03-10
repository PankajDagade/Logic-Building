/* Accept number from user if number is less than 10 then print "Hello" otherwise print "Hello".*/


import java.lang.*;
import java.util.*;

class Print {
	
	public int iNo = 0;
	
	public void Accept(){
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public void Display(){
		
		if( (iNo < 10) )
			System.out.println("Hello");
		else
			System.out.println("Demo");			
	}
}
class program153 {
	public static void main(String args[]) {
		
		Print obj = new Print();
		obj.Accept();
		obj.Display();
	}
}
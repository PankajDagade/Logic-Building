/* Program divisible by 2 or Not */

import java.lang.*;
import java.util.*;

class Divide {
	
	public int iNo = 0;
	
	public void Accept(){
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public void Display(){
		
		if( (iNo%2) == 0)
			System.out.println(iNo+" is divisible by 2");
		else
			System.out.println(iNo+" is not divisible by 2");			
	}
}
class program148 {
	public static void main(String args[]) {
		
		Divide obj = new Divide();
		obj.Accept();
		obj.Display();
	}
}
/*Accept one number from user and check whether is divisible by 5 or not*/

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
		
		if( (iNo%5) == 0)
			System.out.println(iNo+" is divisible by 5");
		else
			System.out.println(iNo+" is not divisible by 5");			
	}
}
class program151 {
	public static void main(String args[]) {
		
		Divide obj = new Divide();
		obj.Accept();
		obj.Display();
	}
}
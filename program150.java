/* Accept to print 5 to 1 number on screen*/

import java.lang.*;
import java.util.*;

class Number {
	
	public int iNo = 0;
	
	public void Accept(){
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public void Display(){
        
		for(int i = iNo ; i >= 1 ; i--)
			System.out.print(i+"  ");
	}
}
class program150 {
	public static void main(String args[]) {
		
		Number obj = new Number();
		obj.Accept();
		obj.Display();
	}
}
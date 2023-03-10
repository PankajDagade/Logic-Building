/* Accept one number from user and print that number of * on screen*/

import java.lang.*;
import java.util.*;

class Star {
	
	public int iNo = 0;
	
	public void Accept(){
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public void Display(){
        
		for(int i = 1 ; i <= iNo ; i++)
			System.out.print("\t*");
	}
}
class program152 {
	public static void main(String args[]) {
		
		Star obj = new Star();
		obj.Accept();
		obj.Display();
	}
}
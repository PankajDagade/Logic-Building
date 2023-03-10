/* Program to print 5 times "Marvellous" on screen*/

import java.lang.*;
import java.util.*;

class Marvellous {
	
	public int iNo = 0;
	
	public void Accept(){
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public void Display(){
        
		for(int i = 1 ; i <= iNo ; i++)
			System.out.println("Marvellous");
	}
}
class program149 {
	public static void main(String args[]) {
		
		Marvellous obj = new Marvellous();
		obj.Accept();
		obj.Display();
	}
}
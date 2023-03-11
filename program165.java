/* 
     Input = 12345

     Summation is : 15
*/

import java.lang.*;
import java.util.*;

class Summation {
	
	public int iNo = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public int Display() {
		
		int iDigit = 0;
		int iSum = 0;
		
		while(iNo > 0)
		{
			iDigit = iNo%10;
			iSum = iSum + iDigit;
			iNo = iNo/10;
		}
		return iSum;
	}
}

class program165 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Summation sobj = new Summation();
		sobj.Accept();
		iRet = sobj.Display();
		System.out.println("Summation is : "+iRet);
	}
}
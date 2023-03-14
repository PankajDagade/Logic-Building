/* Write a program which accept number from user and return Multiplication of digits. 

       Input  : 2395
 	   Output : 270
	   
	   Input  : 1018
 	   Output : 8
*/

import java.lang.*;
import java.util.*;

class MultiDigits {
	
	public int iNo;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\tInput :  ");
		iNo = sobj.nextInt();
	}
	public int MultiDigit() {
		
		int iDigit = 0;
		int iMulti = 1;
		
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iMulti = iMulti * iDigit;
			iNo = iNo/10;
		}
		return iMulti;
	}
}
class program174 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		MultiDigits cobj = new MultiDigits();
		cobj.Accept();
		
		iRet = cobj.MultiDigit();
		System.out.print("\tOutput : "+iRet);
	}
}
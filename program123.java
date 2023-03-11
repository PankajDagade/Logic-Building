/* Write a program which accept number from user and display its digits in reverse order 

     Input  : 12345
	 Output : 54321

*/

import java.lang.*;
import java.util.*;

class Reverse {
	
	public int iNo = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println();
		System.out.print("\tInput   : ");
		iNo = sobj.nextInt();
	}
	public int ReverseDigit() {
		
		int iRev = 0;
		int iDigit = 0;
		
		while(iNo != 0)
		{
			iDigit = iNo%10;
			iRev = iRev * 10 + iDigit;
			iNo = iNo/10;
		}
		return iRev;
	}
}
class program123 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Reverse robj = new Reverse();
		robj.Accept();
		
		iRet = robj.ReverseDigit();
		
		System.out.println();
		System.out.print("\tOutput  : "+iRet);
		System.out.println();
	}
}
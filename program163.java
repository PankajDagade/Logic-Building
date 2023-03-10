/* Write a program which accept number from user and return summation of all its non-factors */

import java.lang.*;
import java.util.*;

class SumNonFact {
	
	public int iNo = 0;
	public int iSum = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println();
		System.out.print("\tInput  : ");
		iNo = sobj.nextInt();
	}
	public int Display() {
		
		for(int iCnt = 1 ; iCnt < iNo ; iCnt++){
			if( (iNo%iCnt) != 0)
				iSum = iSum+iCnt;
		}
		return iSum;
	}
}
class program163 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		SumNonFact sobj = new SumNonFact();
		sobj.Accept();
		iRet = sobj.Display();
		System.out.println();
		System.out.println("\tOutput: "+iRet);
	}
} 
/* Write a program which accept number from user and return difference between summation of all its factors and non-factors */

import java.lang.*;
import java.util.*;

class FactDiff {
	
	public int iNo = 0;
	public int iSum1, iSum2 , iSum3 = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\tInput : ");
		iNo = sobj.nextInt();
	}
	public int Display() {
		
		for(int iCnt = 1 ; iCnt < iNo ; iCnt++){
			if( (iNo%iCnt) == 0){
				iSum1 = iSum1 + iCnt;
			}
			else if( (iNo%iCnt) != 0){
				iSum2 = iSum2 + iCnt;
			}
		}
		iSum3 = iSum1-iSum2;
		return iSum3;
	}
}
class program164 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		FactDiff fobj = new FactDiff();
		fobj.Accept();
		iRet = fobj.Display();
		System.out.print("\tOutput : "+iRet);
		
	}
}
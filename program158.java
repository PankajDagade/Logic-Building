/* Write a program which accept number from user and Display its Multiplication of factors */

import java.lang.*;
import java.util.*;

class MultiFact {
	
	public int iNo = 0;
	public int iMulti = 1;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public int Display() {
		
		for(int iCnt = 1 ; iCnt < iNo ; iCnt++){
			if( (iNo%iCnt) == 0)
				iMulti = iMulti*iCnt;
		}
		return iMulti;
	}
}
class program158 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		MultiFact mobj = new MultiFact();
		mobj.Accept();
		iRet = mobj.Display();
		System.out.println(iRet);
	}
} 
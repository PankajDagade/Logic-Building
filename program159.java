/* Write a program which accept number from user and Display its factors in decreasing order */

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
	public void Display() {
		
		for(int iCnt = iNo/2 ; iCnt >= 1 ; iCnt--){
			if( (iNo%iCnt) == 0)
				System.out.print(iCnt+" ");
		}
	}
}
class program159 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		MultiFact mobj = new MultiFact();
		mobj.Accept();
		mobj.Display();
	}
} 
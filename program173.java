/* Write a program which accept number from user and return the Count of even digits. 

       Input  : 234456
 	   Output : 4
	   
	   Input  : 897
 	   Output : 0
*/

import java.lang.*;
import java.util.*;

class CountRange {
	
	public int iNo;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\tInput :  ");
		iNo = sobj.nextInt();
	}
	public int CountFrequency() {
		
		int iDigit = 0;
		int iCnt = 0;
		
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			if( (iDigit > 3) && (iDigit < 7) ){
				iCnt++;
			}
			iNo = iNo/10;
		}
		return iCnt;
	}
}
class program173 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		CountRange cobj = new CountRange();
		cobj.Accept();
		
		iRet = cobj.CountFrequency();
		System.out.print("\tOutput : "+iRet);
	}
}
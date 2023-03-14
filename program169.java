/* Write a program which accept number from user and frequency of 4 in it 

       Input  : 23445
 	   Output : 1
	   
	   Input  : 33445
 	   Output : 0
*/

import java.lang.*;
import java.util.*;

class CountFour {
	
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
			if(iDigit == 4){
				iCnt++;
			}
			iNo = iNo/10;
		}
		return iCnt;
	}
}
class program169 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		CountFour cobj = new CountFour();
		cobj.Accept();
		
		iRet = cobj.CountFrequency();
		System.out.print("\tOutput : "+iRet);
	}
}
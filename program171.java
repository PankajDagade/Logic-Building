/* Write a program which accept number from user and return the Count of even digits. 

       Input  : 234456
 	   Output : 4
	   
	   Input  : 33445
 	   Output : 2
*/

import java.lang.*;
import java.util.*;

class CountEven {
	
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
			if( (iDigit%2)==0){
				iCnt++;
			}
			iNo = iNo/10;
		}
		return iCnt;
	}
}
class program171 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		CountEven cobj = new CountEven();
		cobj.Accept();
		
		iRet = cobj.CountFrequency();
		System.out.print("\tOutput : "+iRet);
	}
}
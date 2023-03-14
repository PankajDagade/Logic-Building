/* Accept number from user and return frequency of even numbers.

    Input    : 6
	Elements : 85 66 3 80 93 88
	Output   : 3
*/

import java.lang.*;
import java.util.*;

class DisplayEvenFreq {
	
	int Arr[];
	
	public DisplayEvenFreq(int length) {
		Arr = new int[length];
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("\nElements : ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public int CountEven() {
		
		int iCount = 0;
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if( (Arr[iCnt] % 2 == 0) ){
				iCount++;
			}
		}
		return iCount;
	}
}
class program182 {
	public static void main(String args[]) {
		 
		 int iRet = 0;
		 
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nInput : ");
		int iNo = sobj.nextInt();
		
		DisplayEvenFreq dobj = new DisplayEvenFreq(iNo);
		dobj.Accept();
		
		iRet = dobj.CountEven();
		System.out.print("\nOutput : "+iRet);
	}
}
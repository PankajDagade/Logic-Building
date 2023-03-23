/* Accept N numbers from user and return the largest number 

   Input :  N : 6
            Elements : 85 66 3 66 93 88
   Output : 93

*/

import java.lang.*;
import java.util.*;

class iMax {
	
	public int Arr[];
	
	public iMax(int length) {
		Arr = new int[length];	
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("\nElements : ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public int iMaximum() {
		
		int Max = Arr[0];
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if(Max < Arr[iCnt]){
				Max = Arr[iCnt];
			}
		}
		return Max;
	}
}
class program189 {
	public static void main(String args[]) {
		
		int iNo = 0;
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nN  : ");
		iNo = sobj.nextInt();
		
		iMax mobj = new iMax(iNo);
		mobj.Accept();
		iRet = mobj.iMaximum();
		
		System.out.print("\nOutput : "+iRet);
		System.out.println();
	}
}
/* Accept N numbers from user and return the smallest number 

   Input :  N : 6
            Elements : 85 66 3 66 93 88
   Output : 93

*/

import java.lang.*;
import java.util.*;

class iMin {
	
	public int Arr[];
	
	public iMin(int length) {
		Arr = new int[length];	
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("\nElements : ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public int iMinimum() {
		
		int Min = Arr[0];
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if(Arr[iCnt] < Min ){
				Min = Arr[iCnt];
			}
		}
		return Min;
	}
}
class program190 {
	public static void main(String args[]) {
		
		int iNo = 0;
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nN  : ");
		iNo = sobj.nextInt();
		
		iMin mobj = new iMin(iNo);
		mobj.Accept();
		iRet = mobj.iMinimum();
		
		System.out.print("\nOutput : "+iRet);
		System.out.println();
	}
}
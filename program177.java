/* Accept input from N from user and display all such elements which are Even and divisible by 5. 

       Input  : N : 6
	   Elements : 85 66 3 80 93 88
	   Output : 
*/

import java.lang.*;
import java.util.*;

class EvenOddDiff {
	
	public int Arr[];
	
	public EvenOddDiff(int iNo) {
		Arr = new int[iNo];
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Elements ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Arr[iCnt] = sobj.nextInt();
		}
	}
    public int Difference() {
		
		int iSum1 = 0;
		int iSum2 = 0;
		int iSum3 = 0;
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if( (Arr[iCnt]%2) == 0){
				iSum1 = iSum1 + Arr[iCnt];
			}
			else if( (Arr[iCnt]%2) != 0 ){
				iSum2 = iSum2 + Arr[iCnt];
			}
		}
		iSum3 = iSum1 - iSum2;
		return iSum3;
	}
}
class program177 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Input   : ");
		int iLength = sobj.nextInt();
		
		EvenOddDiff obj = new EvenOddDiff(iLength);
		obj.Accept();
		
		iRet = obj.Difference();
		System.out.println();
		System.out.println("Output   : "+iRet);
		System.out.println();
	}
}
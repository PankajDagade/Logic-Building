/* Write a program which accept number from user and return difference between frequency of even digits and  odd digits
  
      Input = N : 7
	  Elements : 85 66 3 80 93 88 90
	  Output : 1(4-3)

*/
import java.lang.*;
import java.util.*;

class EvenOddFreq {
	
	public int Arr[];
	
	public EvenOddFreq(int length) {
		Arr = new int[length];
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Elements ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public int Frequency() {
		
		int iFreq1 = 0;
		int iFreq2 = 0;
		int iFreq3 = 0;
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if( (Arr[iCnt] % 2) == 0 )
				iFreq1++;
			else if( (Arr[iCnt] % 2) != 0 )
				iFreq2++;
		}
		iFreq3 = iFreq1 - iFreq2;
		return iFreq3;
	}
}
class program183 {
	public static void main(String args[]) {
		
       int iRet = 0;
	   
	   Scanner sobj = new Scanner(System.in);

       System.out.print("Input : ");
	   int iNo = sobj.nextInt();
	
       EvenOddFreq obj = new EvenOddFreq(iNo);
	   obj.Accept();
	   
	   iRet = obj.Frequency();
	   System.out.print("Output : "+iRet);
	}
}
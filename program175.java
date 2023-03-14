/* Write a program which accept number from user and return difference between summation of even digits and summation of odd digits*/

import java.lang.*;
import java.util.*;

class CountDiff {
	
	public int Arr[];
	
	public CountDiff(int iLength){
		Arr = new int[iLength];
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\tInput :  ");
		iNo = sobj.nextInt();
	}
	public int CountDifference() {
		
		int iDigit = 0;
		int iSum1 = 0;
		int iSum2 = 0;
		int iSub = 0;
		
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			if( (iDigit%2)==0){
				iSum1 = iSum1+iDigit;
			}
			else if( (iDigit%2)!=0){
				iSum2 = iSum2+iDigit;
			}
			iNo = iNo/10;
		}
		iSub = iSum1 - iSum2;
		return iSub;
	}
}
class program175 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of iLength");
		int iNo = sobj.nextInt();
		
		CountDiff cobj = new CountDiff(iNo);
		cobj.Accept();
		
		iRet = cobj.CountDifference();
		System.out.print("\tOutput : "+iRet);
	}
}
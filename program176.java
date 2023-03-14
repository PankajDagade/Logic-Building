/* Write a program which accept number from user and Summation of Elements 

     Input    : 4
	 Elements : 10 20 30 40
	 Output   : 100

*/
import java.lang.*;
import java.util.*;

class Summation {
	
	public int Arr[];
	
	public Summation(int iNo) {
		Arr = new int [iNo];
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Elements  : ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public int iSummation() {
		
		int iSum = 0;
	
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			iSum = iSum+Arr[iCnt];
		}
		return iSum;
	}
}
class program176 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Input : ");
		int iLength = sobj.nextInt();
		
		Summation obj = new Summation(iLength);
		obj.Accept();
		iRet = obj.iSummation();
		System.out.println("Output : "+iRet);
	}
}
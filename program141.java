import java.lang.*;
import java.util.*;

class Sum {
	
	private int no, iSum = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		no = sobj.nextInt();
	}
	public int Summation() {
		
		for(int iCnt = 1 ; iCnt <= no ; iCnt++){
			iSum = iSum + iCnt;
		}
		return iSum;
	}
}
class program141 {
	public static void main(String args[]) {
		
		Sum obj = new Sum();
		obj.Accept();
		int iRet = obj.Summation();
		System.out.println("Summation is : "+iRet);
		
	}
}
import java.lang.*;
import java.util.*;

class SumFact {
	
	public int iNo = 0;
	public int iSum = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public int Display() {
		
		for(int iCnt = 1 ;  iCnt <= iNo ; iCnt++){
			if( (iNo % iCnt) == 0)
				iSum = iSum + iCnt;
		}
		return iSum;
	}
}
class program145 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		SumFact obj = new SumFact();
		obj.Accept();
		iRet = obj.Display();
		System.out.print("Summation is : "+iRet);
	}
}
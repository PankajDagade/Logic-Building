import java.lang.*;
import java.util.*;

class ChkPerfect {
	
	public int iSum = 0;
	
	public int CheckPerfect(int iNo) {
		
		for(int iCnt = 1 ; iCnt <= iNo ; iCnt++){
			if( (iNo%iCnt) == 0)
				iSum = iSum+iCnt;
		}
		
		if(iSum == iNo)
			return 0;
		else
			return 1;
	}
}
class program146 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int iValue = sobj.nextInt();
		
		ChkPerfect cobj = new ChkPerfect();
		iRet = cobj.CheckPerfect(iValue);
		
		if(iRet == 1)
			System.out.println(iValue+ " is a perfect number");
		else
			System.out.println(iValue+ " is not perfect number");
	}
}
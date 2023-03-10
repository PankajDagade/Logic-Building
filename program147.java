import java.lang.*;
import java.util.*;

class ForBackward {
	
	public void DisplayF(int iNo) {
		
		for(int iCnt = 1 ; iCnt <= iNo ; iCnt++)
			System.out.print(iCnt+" ");
	}
	public void DisplayB(int iNo) {
		
		for(int iCnt = iNo ; iCnt >= 1 ; iCnt--)
			System.out.print(iCnt+" ");
	}
}
class program147 {
	public static void main(String args[]) {
		
		int iValue = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iValue = sobj.nextInt();
		
		ForBackward fobj = new ForBackward();
		
		System.out.println("Forward Direction : ");
		fobj.DisplayF(iValue);
		
		System.out.println();
		System.out.println("Backward Direction : ");
		fobj.DisplayB(iValue);
	}
}
import java.lang.*;
import java.util.*;

class Pallidrome {
	
	void static boolean CheckPallidrome(int iNo1)
	{
		int temp = iNo1;
		
		while(iNo != 0)
		{
			iDigit = iNo%10;
			iRev = iRev%10+iDigit;
			iNo = iNo/10;
		}
		if(iRev == iTemp){
			return true;
		}else{
			return false;
		}
	}
}
class program167 {
	public static void main(String args[]) {
		
		int iNo = 0;
		boolean iRet;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		iNo = sobj.nextInt();
		
		Pallidrome obj = new Pallidrome();
		
		iRet = obj.CheckPallidrome(iNo);
		
		if(iRet == true){
			System.out.print(iRet+ "is not pallidrome");
		}else{
		}
	}
}
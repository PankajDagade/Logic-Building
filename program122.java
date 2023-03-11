/* Write a program which accept number from user and check whether it contains Zero or Not 

   Input  : 1234
   Output : There is no Zero
   
   Input  : 10234
   Output : It contains Zero
   
*/

import java.lang.*;
import java.util.*;

class ChkZero {
	
	public int iNo = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\tInput  :  ");
		iNo = sobj.nextInt();
	}
	public boolean CheckZero() {
		
		int iDigit = 0;
		
		if(iNo == 0){
			return true;
		}
		if(iNo < 0){
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			if(iDigit == 0){
				return true;
			}else{
				iNo = iNo/10;
			}
		}
		return false;
	}
}
class program122 {
	public static void main(String args[]) {
		
		boolean iRet = false;
		
		ChkZero cobj = new ChkZero();
		cobj.Accept();
		iRet = cobj.CheckZero();
		
		if(iRet == true){
			System.out.println("\tOutput : It Contains Zero");
		}else{
			System.out.println("\tOutput : There is no Zero");
		}
		
	}
}
ka/* Accept N numbers from user and Accept one another number as NO, check whether NO is present or Not 

     Input :  N  : 6
	      No : 66
              Elements : 85 66 3 66 93 88
     Output : TRUE
	 
     Input :  N  : 6
              No : 12
              Elements : 85 66 3 66 93 8 98
     Output : FALSE
*/

import java.lang.*;
import java.util.*;

class Check {
	
	public int Arr[];
	public int iNo;
	
	public Check(int length) {
		Arr = new int[length];
	}
	public void Accept() {
		
		int iCnt = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\n NO : ");
		iNo = sobj.nextInt();
		
		System.out.println("\n Elements :  : ");
		for(iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public boolean CheckDigit() {
		
		int iCnt = 0;
		
		for(iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if(Arr[iCnt] == iNo){
				return true;
			}
		}
		return false;
	}
}
class program187 {
	public static void main(String args[]) {
		
		boolean iRet;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\n N  : ");
		int No = sobj.nextInt();
		
		Check cobj = new Check(No);
		cobj.Accept();
		iRet = cobj.CheckDigit();
		
		if(iRet == true){
			System.out.println("\n Output : TRUE");
		}else{
			System.out.println("\n Output : FALSE");
		}
	}
}
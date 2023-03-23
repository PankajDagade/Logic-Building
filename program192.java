/* Count number of small letter 

   Input : Enter the String : 
            Pankaj Dagade
   Output : Number of small letter : 10
*/

import java.lang.*;
import java.util.*;

class Countletter {
	
	public String str;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nEnter the String : ");
		str = sobj.nextLine();
	}
	public int Display() {
		
		char Arr[] = str.toCharArray();
		
		int iCnt = 0;
		
		for(int i = 0 ; i < Arr.length ; i++){
			if(Arr[i] >= 'a' && Arr[i] < 'z'){
				iCnt++;
			}
		}
		return iCnt;
	}
}
class program192 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Countletter cobj = new Countletter();
		cobj.Accept();
		iRet = cobj.Display();
		System.out.print("\nNumber of small letter are : "+iRet);
		System.out.println();
	}
}
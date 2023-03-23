/* Accept number from user and Display prime number or not. 

    Input : Enter the number : 2 
	Output : 2 is a Prime number
	
	Input : Enter the number : 4 
	Output : 4 is a not Prime number
	
*/

import java.lang.*;
import java.util.*;

class PrimeNumber {
	
	public int iNo;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public void Display() {
		
		int iCount = 0;
		
		for(int iCnt = 2 ; iCnt < iNo ; iCnt++){
			if(iNo % iCnt == 0){
				iCount++;
				break;
			}
		}
		if(iCount == 0){
			System.out.println(iNo+" is a Prime number");
		}else{
			System.out.println(iNo+ " is a not Prime number");
		}
	}
}
class program200 {
	public static void main(String args[]) {

		PrimeNumber obj = new PrimeNumber();
		obj.Accept();
		obj.Display();
	}
}
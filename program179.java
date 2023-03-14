/* Accept number from user and display all such elements which are Even and divisible by 5 

    Input    : 6
	Elements : 85 66 3 80 93 88
	Output   : 80
*/

import java.lang.*;
import java.util.*;

class DisplayEven {
	
	int Arr[];
	
	public DisplayEven(int length) {
		Arr = new int[length];
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("\nElements : ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public void Display() {
		
		System.out.print("\nOutput  : ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if( (Arr[iCnt] % 2 == 0) && (Arr[iCnt]%5 == 0)  ){
				System.out.print(Arr[iCnt]+" ");
			}
		}
		System.out.println();
	}
}
class program179 {
	public static void main(String args[]) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nInput : ");
		int iNo = sobj.nextInt();
		
		DisplayEven dobj = new DisplayEven(iNo);
		dobj.Accept();
		dobj.Display();
	}
}
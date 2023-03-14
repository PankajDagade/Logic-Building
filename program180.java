/* Accept number from user and display all such elements which are divisible by 3 and 5 

    Input    : 6
	Elements : 85 66 3 15 93 88
	Output   : 15
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
			if( (Arr[iCnt] % 3 == 0) && (Arr[iCnt] % 5 == 0)  ){
				System.out.print(Arr[iCnt]+" ");
			}
		}
		System.out.println();
	}
}
class program180 {
	public static void main(String args[]) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nInput : ");
		int iNo = sobj.nextInt();
		
		DisplayEven dobj = new DisplayEven(iNo);
		dobj.Accept();
		dobj.Display();
	}
}
/* Accept number from user and display all such elements which are multiples by 11 

    Input    : 6
	Elements : 85 66 3 55 93 88
	Output   : 66  55  88
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
			if( (Arr[iCnt] % 11 == 0) ){
				System.out.print(Arr[iCnt]+" ");
			}
		}
		System.out.println();
	}
}
class program181 {
	public static void main(String args[]) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nInput : ");
		int iNo = sobj.nextInt();
		
		DisplayEven dobj = new DisplayEven(iNo);
		dobj.Accept();
		dobj.Display();
	}
}
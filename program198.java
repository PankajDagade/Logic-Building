import java.lang.*;
import java.util.*;

class program198 {
	public static void main(String args[]) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nEnter the String : \t");
		String str = sobj.nextLine();
		
		String Arr[] = str.split(" ");
		
		int iMax = 0;
		int Pos = 0;
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if(Arr[iCnt].length() >= iMax){
				iMax = Arr[iCnt].length();
				Pos = iCnt;
			}
		}
		System.out.println("\n\tLength of largest word : "+iMax);
		System.out.println("\n\tLargest word is : "+Arr[Pos]);
		
	}
}
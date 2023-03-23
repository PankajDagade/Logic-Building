import java.lang.*;
import java.util.*;

class Maximum {
	
	public String str;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		str = sobj.nextLine();
	}
	public int Display() {
		
		String Arr[] = str.split(" ");
		
		int iMax = 0;
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if( Arr[iCnt].length() > iMax ){
				iMax = Arr[iCnt].length();
			}
		}
		return iMax;
	}
}
class program197 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Maximum mobj = new Maximum();
		mobj.Accept();
		iRet = mobj.Display();
		System.out.println("Length of largest word is : "+iRet);
	}
}
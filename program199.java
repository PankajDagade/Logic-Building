import java.lang.*;
import java.util.*;

class Buffere {
	
	public String str;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		str = sobj.nextLine();
	}
	public void Display() {
		
		String Arr[] = str.split(" ");
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			StringBuffer obj = new StringBuffer(Arr[iCnt]);
			System.out.println(obj.reverse());
		}
	}
}
class program199 {
	public static void main(String args[]) {
		
		Buffere bobj = new Buffere();
		bobj.Accept();
		bobj.Display();
	}
}
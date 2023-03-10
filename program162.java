import java.lang.*;
import java.util.*;

class CountDigit {
	
	public int iNo = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public int Display() {
		
	    int iCount = 0;
	    int iDigit = 0;
	
		while(iNo > 0)
		{
			iDigit = iNo%10;
			iCount++;
			iNo = iNo/10;
		}
		return iCount;
	}
}
class program162 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		CountDigit cobj = new CountDigit();
		cobj.Accept();
		iRet = cobj.Display();
		System.out.println("Number of digit are : "+iRet);
		
	}
}
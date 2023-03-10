/*
   Input = 12345
   Output = 5 4 3 2 1
 */
 
import java.lang.*;
import java.util.*;

class iDigit {
	
	public int iNo = 0;
	public int iDigit = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public void Display() {
		
		while(iNo != 0)
		{
			iDigit = iNo%10;
			System.out.print(iDigit+" ");
			iNo = iNo/10;
		}
	}
}
class program161 {
	public static void main(String args[]) {
		
		iDigit iobj = new iDigit();
		iobj.Accept();
		iobj.Display();
	}
}
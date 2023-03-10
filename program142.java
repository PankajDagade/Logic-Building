import java.lang.*;
import java.util.*;

class DivisbleORNot {
	
	public boolean Check(int iValue) {
		
		if( ((iValue%3) == 0) && ((iValue%5) == 0) )
             return true;
        else
             return false;			
	}
}
class program142 {
	public static void main(String args[]) {
		
		boolean iRet = false;
		
		DivisbleORNot dobj = new DivisbleORNot();
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int iNo = sobj.nextInt();
		
		iRet = dobj.Check(iNo);
		
		if(iRet == true)
			System.out.println(iNo+" is Divisible by 3 and 5");
		else
			System.out.println(iNo+" is not Divisible by 3 and 5");
	}
}
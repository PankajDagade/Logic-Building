import java.lang.*;
import java.util.*;

class factorial {
	
	public int iNo = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
	    iNo = sobj.nextInt();
	}
	public void Display() {
		
		for(int iCnt = 1 ; iCnt <= iNo ; iCnt++){
			if( (iNo%iCnt) == 0 )
				System.out.print(iCnt+"  ");
		}
	}
}
class program143 {
	public static void main(String args[]) {
		
		factorial fobj = new factorial();
		fobj.Accept();
		fobj.Display();
	}
}
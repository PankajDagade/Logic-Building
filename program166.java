import java.lang.*;
import java.util.*;

class DisplayEven {
	
	public int iNo = 0;
	
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.print("\tInput  :  ");
		iNo = sobj.nextInt();
	}
	public void Display(){
		
		int iDigit = 0;
		
		System.out.println(" ");
		System.out.print("\tEven Digit : ");
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			if(iDigit % 2 == 0){
				System.out.print(iDigit+"  ");
			}
			iNo = iNo/10;
		}
		System.out.println(" ");
	}
}
class program166 {
	public static void main(String args[]) {
		
		DisplayEven dobj = new DisplayEven();
		dobj.Accept();
		dobj.Display();
	}
}
import java.lang.*;
import java.util.*;

class Pattern
{
	private int iNo;
	private char ch;
			
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		iNo = sobj.nextInt();
	}
	public void Display()
	{
		int iCnt;
		if(iNo > 0)
		{
			for(iCnt = 1,ch = 'A' ; iCnt <= iNo ; ch++,iCnt++)
			{
				System.out.print("  "+ch);
			}
		}
		else
		{
			System.out.println("Enter positive number");
		}
	}
}
class program75
{
	public static void main(String args[])
	{
		Pattern obj = new Pattern();
		obj.Accept();
		obj.Display();
	}
}
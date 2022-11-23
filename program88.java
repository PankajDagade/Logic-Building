import java.lang.*;
import java.util.*;

class Pattern
{
	private int iRow;
	private int iCol;
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		iRow = sobj.nextInt();
		System.out.println("Enter the number of columns : ");
		iCol = sobj.nextInt();
	}
	
	public void Display()
	{
		int i,j = 0;
		char ch = '\0';
		for(i = 1 ; i <= iRow ; i++)
		{
			for(j = 1,ch = 'a' ; j <= iCol ; ch++,j++)
			{
				if((i % 2) != 0)
				{
					System.out.print("  "+ch);
				}else{
					System.out.print("  "+j);
				}
			}
			System.out.println("");
		}
	}
}
class program88
{
	public static void main(String args[])
	{
		Pattern obj = new Pattern();
		obj.Accept();
		obj.Display();
	}
}
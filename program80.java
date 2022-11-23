import java.lang.*;
import java.util.*;

class Pattern
{
	private int iRow,iCol;
			
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		iRow = sobj.nextInt();
		System.out.print("Enter the number of columns : ");
		iCol = sobj.nextInt();
	}
	public void Display()
	{
		int i , j = 0;
		if((iRow > 0) && (iCol > 0))
		{
			for(i = 1 ; i <= iRow ; i++)
			{
				for(j = 1 ; j <= iCol ; j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Enter positive number");
		}
		
	}
}
class program80
{
	public static void main(String args[])
	{
		Pattern obj = new Pattern();
		obj.Accept();
		obj.Display();
	}
}
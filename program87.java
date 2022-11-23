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
		 int iElement = 0;
		  int iCount = 0;
		
			for(i = 1 ; i <= iRow ; i++)
			{
				iCount = 0;
				for(j = 1 ; j <= iCol ; j++)
				{
					if((i % 2) != 0)
					{
						iCount++;
						iElement = iCount + j;
						System.out.print(iElement+"  ");
					}
					else
					{
						iElement = iCount + j;
						System.out.print(iElement+"  ");
						iCount++;
					}
				}
				System.out.println("");
			}
	}
}
class program87
{
	public static void main(String args[])
	{
		Pattern obj = new Pattern();
		obj.Accept();
		obj.Display();
	}
}
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
		
			for(i = iRow ; i >= 1 ; i--)
			{
				for(j = 1 ; j <= iCol ; j++)
				{
					System.out.print(i+"  ");
				}
				System.out.println();
			}
	}
}
class program85
{
	public static void main(String args[])
	{
		Pattern obj = new Pattern();
		obj.Accept();
		obj.Display();
	}
}
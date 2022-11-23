import java.lang.*;
import java.util.*;


class Pattern
{
	private int iRow;
	private int iCol;
	
	public Pattern(int iRow,int iCol)
	{
		this.iRow = iRow;
		this.iCol = iCol;
	}
	
	public void Display()
	{
		for(int i = 1 ; i <= iRow ; i++)
		{
			for(int j = 1 ; j <= iCol ; j++)
			{
				if( (i>j) || (i==j) )
				{
					System.out.print("* ");
				}else{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}
class program91
{
	 public static void main(String args[])
	 {
		 Pattern obj = new Pattern(6,6);
		 obj.Display();
	 }
}
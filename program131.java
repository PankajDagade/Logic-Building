/*

 0 0 0 0 0
 * * * * *
 0 0 0 0 0
 * * * * *
 0 0 0 0 0
   
   iRow = 5 , iCol = 5
 */

import java.lang.*;
import java.util.*;

class Pattern{
	
	public int iRow,iCol;
	
	public Pattern(int iRow, int iCol){
		this.iRow = iRow;
		this.iCol = iCol;
	}
	public void Display(){
		
		int mid = (iRow/2);
		int last = iCol;
		System.out.println();
		for(int i = 1 ; i <= iRow ; i++)
		{
			for(int j = 1 ; j <= iCol ; j++)
				if( (i%2) == 0)
					System.out.print(" *");
				else
					System.out.print(" 0");
			System.out.println();
		}
	}
}
class program131 {
	public static void main(String args[]){
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of rows : ");
		int rows = sobj.nextInt();
		System.out.print("Enter the number of columns : ");
		int col = sobj.nextInt();
		
		Pattern obj = new Pattern(rows,col);
		obj.Display();
	}
}
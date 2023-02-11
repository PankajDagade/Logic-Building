/*
*   *   *
   * * *
 * * * * *
   * * *
 *   *   *
   
   iRow = 8 , iCol = 8
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
		
		int Rmid = (iRow-1)/2;
		int Cmid = (iCol-1)/2;
		int last = iCol - 1;
		System.out.println();
		for(int i = 0 ; i < iRow ; i++)
		{
			for(int j = 0 ; j < iCol ; j++)
				if(i == Rmid || j == Cmid || i == j || j == last-i)
					System.out.print(" *");
				else
					System.out.print("  ");
			System.out.println();
				
		}
	}
}
class program128 {
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
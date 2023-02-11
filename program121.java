/*

    rows : 5
    columns : 5
	
  1   2   3   4   5
  2   3   4   5   6
  3   4   5   6   7
  4   5   6   7   8
  5   6   7   8   9
  
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
		
		for(int i = 1 ; i <= iRow ; i++)
		{
			for(int j = 1 ; j <= iCol ; j++)
				System.out.print("  "+((i+j)-1)+" ");
			System.out.println();
		}
	}
}
class program121{
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
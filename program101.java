import java.lang.*;
import java.util.*;

class Pattern
{
	private int iRow = 0;
	private int iCol = 0;
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number of row : ");
		iCol = sobj.nextInt();
	}
	
	public void Display()
	{
		      int iRow = ((iCol/2)+1);
             for(int i = 1 ; i <= (iRow-1); i++)
			 {
				 for(int j = 1 ; j <= iCol ; j++){
					 if(j==(iCol/2)+1){
						 System.out.print("* ");
					 }else{
						 System.out.print("  ");
					 }
				 }
				 System.out.println();
			 }
             for(int i = 1 ; i <= iRow ; i++)
			 {
				 for(int j = 1 ; j <= iCol ; j++){
					 if((i == 1)||(j == 1)||(j == iCol) || (i == iRow)){
						 System.out.print("* ");
					 }else{
						 System.out.print("  ");
					 }
				 }
			     System.out.println("");
			 }
	}			 
}

class program101
{
	public static void main(String args[])
	{
		Pattern pobj = new Pattern();
		pobj.Accept();
		pobj.Display();
	}
}
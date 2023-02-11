/*
     
 * * * *
 *       *
 *       *
 *       *
 * * * *

  rows = 10
  */
  
  import java.lang.*;
  import java.util.*;
  
  class Pattern
  {
	  private int lines;
	  
	  public Pattern(int lines)
	  {
		  this.lines = lines;
	  }
	  
	  public void Display()
	  {
		  int last =  lines - 1;
		  System.out.println();
		  for(int i = 0 ; i < lines ; i++)
		  {
			  for(int j = 0 ; j < lines ; j++)
				  if( ((i == 0 || i == last) && (j > 0 && j < last)) || j == 0 || (j == last && i > 0 && i < last))
					  System.out.print(" *");
				  else
					  System.out.print("  ");
			  System.out.println("");
		  }
	  
    }
  }
  class program130
  {
	  public static void main(String args[])
	  {
		  Scanner sobj = new Scanner(System.in);
		  
		  System.out.println("Enter the number of rows : ");
		  int rows = sobj.nextInt();
		  
		  Pattern obj = new Pattern(rows);
		  obj.Display();
	  }
  }
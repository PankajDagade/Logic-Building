/*
         *
       *   *
     * * * * *
   *           *
 *               *

  rows = 5
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
		  int mid = (lines-1)/2;
		  int last = lines - 1;
		  for(int i = 0 ; i < lines ; i++)
		  {
			  for(int j = 0 ; j < 2*lines ; j++)
				  if(j == lines-1+i || j == lines-1-i || (i == mid && j >= lines-i && j < 2*last-i) )
					  System.out.print(" *");
				  else
					  System.out.print("  ");
			  System.out.println("");
		  }
	  }
  }
  class program125
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
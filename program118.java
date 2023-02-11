/*

                6
             5  6  7
          4  5  6  7  8
       3  4  5  6  7  8  9
    2  3  4  5  6  7  8  9  10
 1  2  3  4  5  6  7  8  9  10  11

  
  lines = 4
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
		  for(int i = 1 ; i <= lines ; i++)
		  {
			  for(int j = 1 ; j < 2*lines ; j++)
				  if( (j >= (lines-i+1)) && (j <= (lines+i-1)) )
					  System.out.print(" "+j+" ");
				  else
					  System.out.print("   ");
			  System.out.println("");
		  }
	  }
  }
  class program118
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
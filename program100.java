/*

      * * * * * * *
     * * * * * * *
    * * * * * * *
   * * * * * * *
  * * * * * * *
 * * * * * * *
 
 */
import java.lang.*;
import java.util.*;

class Pattern{
	
	public int lines;
	
	public Pattern(int lines)
	{
		this.lines = lines;
	}
	
	public void Display()
	{
		System.out.println();
		for(int i = 0 ; i < lines ; i++)
		{
			for(int j = 0 ; j < 2*lines ; j++)
				if( j >= ((lines - i)-1) && j <= ((2 * lines)-i-1))
					System.out.print(" *");
				else
					System.out.print(" ");
			System.out.println();
		}
	}
}
class program100
{
	public static void main(String args[])
	{
		Pattern obj = new Pattern(6);
		obj.Display();
	}
}
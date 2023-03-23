/*     
      Enter the String : Pankaj
      P P P P P P
      a a a a a a
      n n n n n n
      k k k k k k
      a a a a a a
      j j j j j j
 
 */

import java.lang.*;
import java.io.*;

class PatternChar {
	
	public String str;

	public void Accept()throws IOException {
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.print("Enter the String : ");
		str = bobj.readLine();
	}
	public void Display() {
		
		char Arr[] = str.toCharArray();
		
		for(int i = 0 ; i < Arr.length ; i++){
			for(int j = 0 ; j < Arr.length ; j++){
				System.out.print(" "+Arr[i]);
			}
			System.out.println();
		}
	}
}
class program213 {
	public static void main(String args[]) {
		
	try 
	{
		PatternChar obj = new PatternChar();
		obj.Accept();
		obj.Display();
	}
	catch(IOException iobj)
	{}
	}
}
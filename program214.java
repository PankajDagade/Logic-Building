/* 
      Enter the String : Pankaj
      P
      P a
      P a n
      P a n k
      P a n k a
      P a n k a j
*/

import java.lang.*;
import java.io.*;

class Triangle {
	
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
			for(int j = 0 ; j <= i ; j++){
				System.out.print(Arr[j]+" ");
			}
			System.out.println();
		}
	}
}
class program214 {
	public static void main(String args[]) {
		
		try 
		{
			Triangle tobj = new Triangle();
			tobj.Accept();
			tobj.Display();
		}
		catch(IOException iobj)
		{}
	}
}
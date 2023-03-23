/*  
            Enter the String : Hello
            H e l l o
            H e l l
            H e l
            H e
            H
*/

import java.lang.*;
import java.io.*;

class Pattern {                                                              
	
	public String str;
	
	public void Accept()throws IOException {
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.print("Enter the String : ");
		str = bobj.readLine();
	}
	public void Display() {
		
		char Arr[] = str.toCharArray();
		
		for(int i = Arr.length-1 ; i >= 0 ; i--){
			for(int j = 0 ; j <= i ; j++){
				System.out.print(Arr[j]+" ");
			}
			System.out.println();
		}
	}
}
class program215 {
	public static void main(String args[]) {
		
		try 
		{
			Pattern obj = new Pattern();
			obj.Accept();
			obj.Display();
		}
		catch(IOException iobj){}
	}
}
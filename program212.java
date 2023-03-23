/* 
      Enter the String : Hello
       H e l l o
       H e l l o
       H e l l o
       H e l l o
       H e l l o
*/

import java.lang.*;
import java.io.*;

class CharacterPattern {
	
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
				System.out.print(" "+Arr[j]);
			}
			System.out.println();
		}
	}
}
class program212 {
	public static void main(String args[]) {
		
		try{
			CharacterPattern obj = new CharacterPattern();
		    obj.Accept();
			obj.Display();
		}
		catch(IOException iobj){}
	}
}
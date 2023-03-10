import java.lang.*;
import java.io.*;

class program134 {
	public static void main(String args[]) throws IOException {
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.print("Enter the string : ");
		String str = bobj.readLine();
		
		String Arr[] = str.split(" ");
		
		System.out.print("Number of words are : "+Arr.length);
	}
}
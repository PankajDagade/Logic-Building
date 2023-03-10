import java.lang.*;
import java.io.*;

class program132 {
	public static void main(String args[]) throws IOException {
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.print("Enter the String : ");
		String str = bobj.readLine();
		
		char Arr[] = str.toCharArray();
		
		for(int i = 0 ; i < Arr.length ; i++)
			System.out.println(Arr[i]+" ");
	}
}
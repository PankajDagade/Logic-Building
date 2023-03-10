import java.lang.*;
import java.io.*;

class program135 {
	public static void main(String args[]) throws IOException {
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.print("Enter the String : ");
		String str = bobj.readLine();
		
		String newstr = str.replaceAll("dagade","Dagade");
		
		System.out.print(newstr);
	}
}
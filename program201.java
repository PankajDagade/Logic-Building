import java.lang.*;
import java.io.*;

class Strings {
	
	public String str;
	
	public void Accept() throws IOException {
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("\nEnter the String : ");
		str = bobj.readLine();
		System.out.println();
	}
	public void Display() {
		
		String newstr1[] = str.split(" ");
		String newstr2 = str.replaceAll("[^a-z A-z]","");
		
		System.out.println("My name is "+newstr2);
	}
}
class program201 {
	public static void main(String args[]) {
		
		Strings obj = new Strings();
		try {
			obj.Accept();
			obj.Display();
		}
		catch(IOException e) {}
		
	}
}
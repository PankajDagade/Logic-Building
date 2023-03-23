import java.lang.*;
import java.io.*;

class Strings {
	
	public String str;
	
	public void Accept() throws IOException {
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.println("Enter the String : ");
		str = bobj.readLine();
	}
	public void Display() {
		
		str = str.toLowerCase();
		
		char Arr[] = str.toCharArray();
		
		int Frequency[] = new int[26];
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Frequency[Arr[iCnt] - 'a']++;
		}
		
		for(int iCnt = 0 ; iCnt < Frequency.length ; iCnt++){
			System.out.print(" "+Frequency[iCnt]+" ");
		}
	}
}
class program203 {
	public static void main(String args[]) {
		
		Strings obj = new Strings();
		try{
		     obj.Accept();
			 obj.Display();
		}
		catch(IOException i){}
	}
}
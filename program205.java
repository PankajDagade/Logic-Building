import java.lang.*;
import java.io.*;

class Strings {
	
	public String str;
	
	public void Accept()throws IOException {
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.print("\n\tEnter the String : ");
		str = bobj.readLine();
	}
	public void Display() {
		
		str = str.toLowerCase();
		
		char Arr[] = str.toCharArray();
		
		int Frequency[] = new int[26];
		
		int iCnt = 0;
		
		for(iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Frequency[Arr[iCnt] - 'a']++;
		}
		
		int iMax = 0;
		int iPos = 0;
		
		for(iCnt = 0 ; iCnt < Frequency.length ; iCnt++){
			if(Frequency[iCnt] > iMax){
				iMax = Frequency[iCnt];
				iPos = iCnt;
			}
		}
		System.out.println("\n\t"+(char)(iPos + 'a') + "  occurs "+iMax+" number of times in the word");
		
	}
}
class program205 {
	public static void main(String args[]) {
		
		Strings obj = new Strings();
		try {
			obj.Accept();
			obj.Display();
		}
		catch(IOException i){
			
		}
	}
}
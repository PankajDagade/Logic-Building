import java.lang.*;
import java.io.*;

class program206 {
	public static void main(String args[]) throws IOException {
		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);
		
		System.out.print("\n\tEnter the String : ");
		String str1 = bobj.readLine();
		
		str1 = str1.toLowerCase();
		char arr[] = str1.toCharArray();
		int Frequency1[] = new int[26];
		
		System.out.print("\n\tEnter the String : ");
		String str2 = bobj.readLine();
		
		str2 = str2.toLowerCase();
		char brr[] = str2.toCharArray();
		int Frequency2[] = new int[26];
		
		int i = 0;
		
		for(i = 0 ; i < arr.length ; i++){
			Frequency1[arr[i] - 'a']++;
		}
		for(i = 0 ; i < brr.length ; i++){
			Frequency2[brr[i] - 'a']++;
		}
		
		for(i = 0 ; i < Frequency1.length ; i++){
			if(Frequency1[i] != Frequency2[i])
			{
				break;
			}
		}
		
		if(i == 26)
			System.out.print("\n\tOutput : String are Anagram");
		else
			System.out.print("\n\tOutput : String are not Anagram");
		
		System.out.println();
	}
}
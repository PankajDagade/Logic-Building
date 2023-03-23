import java.lang.*;
import java.io.*;
import java.util.*;

class program208 {
	public static void main(String args[]) throws IOException {
		
		 InputStreamReader iobj = new InputStreamReader(System.in);
		 BufferedReader bobj = new BufferedReader(iobj);
		 
		 System.out.print("\n\tEnter the String : ");
		 String str1 = bobj.readLine();
		 
		 System.out.print("\n\tEnter the String : ");
		 String str2 = bobj.readLine();
		 
		 char arr[] = (str1.toLowerCase()).toCharArray();
		 char brr[] = (str2.toLowerCase()).toCharArray();
		 
		 Arrays.sort(arr);
		 Arrays.sort(brr);
		 
		 if(Arrays.equals(arr,brr)){
			 System.out.println("\n\tOutput : String is Anagram");
		 }else{
			 System.out.println("\n\tOutput : String is not Anagram");
		 }
	}
}
import java.lang.*;
import java.io.*;

class program133 {
	public static void main(String args[]) throws IOException {
	
	   InputStreamReader iobj = new InputStreamReader(System.in);
	   BufferedReader bobj = new BufferedReader(iobj);
	
	   System.out.print("Enter the String :");
	   String str = bobj.readLine();
	
	   int iCnt = 0;
	
	   char Arr[] = str.toCharArray();
	
	   for(int i = 0 ; i < Arr.length ; i++){
		   if( (Arr[i] >= 'a') && (Arr[i] <= 'z') )
			      iCnt++;
	   }
	   System.out.println("Small character are : "+iCnt);
	}
}
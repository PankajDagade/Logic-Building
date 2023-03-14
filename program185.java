/* Accept N numbers from user and return frequency of 11 

      N : 6
	  Elements : 85 66 11 80 93 88
	  Output : 1
	  
	  N : 6
	  Elements : 85 66 12 80 93 88
	  Output : 0

*/
  
import java.lang.*;
import java.util.*;

class Frequency 
{
	
	public int Arr[];
	
	public Frequency(int length) 
	{
		Arr = new int[length];
	}
	public void Accept() 
	{
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Elements ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public int FrequencyD() 
	{
		int iCount = 0;
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if(Arr[iCnt] == 11){
				iCount++;
			}
		}
		return iCount;
	}
}
class program185
{
	public static void main(String args[]) 
	{
		
       int iRet = 0;
	   
	   Scanner sobj = new Scanner(System.in);

       System.out.print("Input : ");
	   int iNo = sobj.nextInt();
	
       Frequency obj = new Frequency(iNo);
	   obj.Accept();
	   
	   iRet = obj.FrequencyD();
	   System.out.print("Output : "+iRet);
	}
}
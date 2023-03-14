/* Accept N numbers from user and Accept one another number as NO , return frequency of NO from it 

      Input : 8
	  N : 11
	  Elements : 11 23 43 54 65 76 
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
	public int NO = 0;
	
	public Frequency(int length) 
	{
		Arr = new int[length];
	}
	public void Accept() 
	{	
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nNO : ");
	    NO = sobj.nextInt();
		System.out.println("\nElements ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public int FrequencyD() 
	{
		int iCount = 0;
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if(Arr[iCnt] == NO){
				iCount++;
			}
		}
		return iCount;
	}
}
class program186
{
	public static void main(String args[]) 
	{
		
       int iRet = 0;
	   
	   Scanner sobj = new Scanner(System.in);

       System.out.print("\nInput : ");
	   int No = sobj.nextInt();
	
       Frequency obj = new Frequency(No);
	   obj.Accept();
	   
	   iRet = obj.FrequencyD();
	   System.out.print("\nOutput : "+iRet);
	}
}
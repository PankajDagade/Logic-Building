/* Accept N numbers from user check whether that numbers contains 11 in it or not 

      N : 6
	  Elements : 85 66 11 80 93 88
	  Output : 11 is present
	  
	  N : 6
	  Elements : 85 66 12 80 93 88
	  Output : 11 is absent

*/
  
import java.lang.*;
import java.util.*;

class Check 
{
	
	public int Arr[];
	
	public Check(int length) 
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
	public int CheckPresentRnot() 
	{
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if(Arr[iCnt] == 11){
				return 1;
			}
		}
		return 0;
	}
}
class program184 
{
	public static void main(String args[]) 
	{
		
       int iRet;
	   
	   Scanner sobj = new Scanner(System.in);

       System.out.print("Input : ");
	   int iNo = sobj.nextInt();
	
       Check obj = new Check(iNo);
	   obj.Accept();
	   
	   iRet = obj.CheckPresentRnot();
	   if(iRet == 1)
		   System.out.println("11 is present");
	   else
		   System.out.println("11 is absent");
	  
	}
}
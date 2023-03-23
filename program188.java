/* Accept numbers from user and return product of all odd elements 

     Enter the number of elements : 4
	 Enter the Elements :
     11
     22
     44
     66
	 Product is : 11

*/

import java.lang.*;
import java.util.*;

class Product {
	
	public int Arr[];
	
	public Product(int length) {
		Arr = new int[length];
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Elements : ");
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public int ProductDigit() {
		
		int iodd = 1;
		
		for(int iCnt = 0 ; iCnt < Arr.length ; iCnt++){
			if(Arr[iCnt] % 2 != 0){
				iodd = iodd * Arr[iCnt];
			}
		}
		return iodd;
	}
}
class program188 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("Enter the number of elements : ");
		int iNo = sobj.nextInt();
		
		Product obj = new Product(iNo);
		obj.Accept();
		iRet = obj.ProductDigit();
		System.out.print("Product is : "+iRet);
	}
}
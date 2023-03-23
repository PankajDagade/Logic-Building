import java.lang.*;
import java.util.*;

class Summation {
	
	public int Arr[][];
	
	public Summation(int iRow, int iCol) {
		Arr = new int[iRow][iCol];
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("\nEnter the Elements : ");
		for(int i = 0 ; i < Arr.length ; i++){
			for(int j = 0 ; j < Arr[i].length ; j++){
				Arr[i][j] = sobj.nextInt();
			}
		}
	}
	public int Sum() {
		
		int iSum = 0;
		
		for(int i = 0 ; i < Arr.length ; i++){
			for(int j = 0 ; j < Arr[i].length ; j++){
				iSum = iSum + Arr[i][j];
			}
		}
		return iSum;
	}
}
class program210 {
	public static void main(String args[]) {
		
		int iRet = 0;
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.print("\nEnter the number of rows : ");
		int row = sobj.nextInt();
		System.out.print("\nEnter the number of columns : ");
		int col =  sobj.nextInt();
		
		Summation obj = new Summation(row,col);
		obj.Accept();
		iRet = obj.Sum();
		System.out.print("Summation of rows and columns are : "+iRet);
	}
}
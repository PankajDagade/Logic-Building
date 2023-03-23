import java.lang.*;
import java.util.*;

class StringX {
	
	public int Arr[][];
	
	public StringX(int row,int col) {
		Arr = new int [row][col];
	}
	public void Accept() {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("\nEnter the Elements : ");
		for(int i = 0 ; i < Arr.length ; i++){
			for(int j = 0 ; j < Arr.length ; j++)
				Arr[i][j] = sobj.nextInt();
		}
	}
	public void Display() {
		
		System.out.print("\nElements are : ");
		for(int i = 0 ; i < Arr.length ; i++){
			for(int j = 0 ; j < Arr[i].length ; j++)
				System.out.print(Arr[i][j]+"  ");
		}
	}
}
class program209 {
	public static void main(String args[]) {
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("\nEnter the number of rows : ");
		int irows = sobj.nextInt();
		
		System.out.println("Enter the number of columns : ");
		int icols = sobj.nextInt();
		
		StringX obj = new StringX(irows,icols);
		obj.Accept();
		obj.Display();
	}
}
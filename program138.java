import java.lang.*;

class Addition {
	
	public int i,j,k;
	
	public Addition(int i, int j){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public void Accept(){
		
		k = i + j;
	}
	public void Display(){
		
		System.out.println("Addition is : "+k);
	}
}
class program138{
	public static void main(String args[]) {
		
		Addition aobj = new Addition(10,20);
		aobj.Accept();
		aobj.Display();
	}
}
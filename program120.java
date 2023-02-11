import java.lang.*;

class Student{
	
	int rollno;
	String name;
	static String college = "MCA";
	
	Student(int r, String n){
		rollno = r;
		name = n;
	}
	public void Display(){
		System.out.println(rollno+" "+name+" "+college);
	}
}
class program120{
	public static void main(String args[]){
		
		Student s1 = new Student(111,"Karan");
		Student s2 = new Student(112,"Rahul");
		
		s1.Display();
		s2.Display();
	}
}
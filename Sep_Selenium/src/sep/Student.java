package sep;

public class Student {
	
	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student deepak=new Student();
		deepak.age=30;
		deepak.rollno=111;
		System.out.println("The age of deepak is "+deepak.age);
		System.out.println("Rollno of deepak is "+deepak.rollno);
		deepak.display1();
		deepak.display2();
		
		Student deep=new Student();
		deep.age=35;
		deep.rollno=121;
		System.out.println("The age of deep is "+deep.age);
		System.out.println("Rollno of deep is "+deep.rollno);
		deep.display1();
		deep.display2();
		
		
	}

}

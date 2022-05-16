package Assingment_01;


class Call{
	static int count=0;
	static void display() {
		
		System.out.println("Display Function called");
		count++;
	}
	
}

public class Q2 {
	public static void main(String[] args) {
		Call obj=new Call();
		Call obj1=new Call();
		Call obj2=new Call();
		obj.display();
		obj.display();
		obj1.display();
		obj1.display();
		obj1.display();
		obj2.display();
		obj2.display();
		System.out.println("Display Called "+obj.count+"times");
		
	}
	

}

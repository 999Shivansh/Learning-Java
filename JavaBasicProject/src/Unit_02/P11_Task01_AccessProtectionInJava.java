package Unit_02;

public class P11_Task01_AccessProtectionInJava {
	public  static void main(String[] args) {
		Childclass obj =new Childclass();
		obj.showdata();
		obj.accessdata();
		
		Anotherclass obj1=new Anotherclass();
		obj1.display();
		
	}

}

class Parentclass{
	int a =10 ; //default protection
	public int b=20; //can be accessed outside unit_02 package but within same project
	protected int c=20; //can only be accessed within same package
	private int d = 40; //within ParentClass only, not even in its sub-class
	
	void showdata() {
		System.out.println("Inside Parentclass");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
}

class Childclass extends Parentclass{
	void accessdata() {
		System.out.println("Inside Childclass");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		//System.out.println("d="+d); //private member
	}
}

class Anotherclass{
	void display() {
		Parentclass obj=new Parentclass();
		System.out.println("Inside Anotherclass");
		System.out.println("a="+obj.a);
		System.out.println("b="+obj.b);
		System.out.println("c="+obj.c);
		
	}
}

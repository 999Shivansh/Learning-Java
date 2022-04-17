package Unit_02;

public class P10_Task01_OverloadingAndOverridingInJava {
	public static void main(String[] args) {
		OverloadingAndOverridingJava obj= new OverloadingAndOverridingJava();
		System.out.println("add() with 2 parameters");
		System.out.println(obj.add(4, 6));
		System.out.println("add() with 3 parameters");
		System.out.println(obj.add(4, 6,7));
		
		First obj1=new First();
		System.out.println(obj1.add(1, 2));
		System.out.println(obj1.add(1, 2,3));
	}

}

class OverloadingAndOverridingJava {
	//within the same class : Method Overloading
	int add(int a,int b) {
		System.out.println("Inside OverloadingandOverriding");
		return a+b;
	}
	int add(int a,int b,int c) {
		System.out.println("Inside OverloadingandOverriding2");
		return a+b+c;
	}
	
}

//Overriding in java require inheritance
class First extends OverloadingAndOverridingJava{
	int add(int a,int b) {
		System.out.println("Inside First");
		return a+b+1;
	}
	int add(int a,int b,int c) {
		System.out.println("Inside First");
		return a+b+c;
	}
}
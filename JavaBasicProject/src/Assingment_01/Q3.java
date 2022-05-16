package Assingment_01;

import java.util.Scanner;

interface In1{
	public void display(int p); 
		
	
}

class testclass implements In1{
	public void display(int p) {
		int n=p-1;
		int c=0;
		while(n>1) {
			if(p%n==0) {
				c++;
				break;
			}
			n--;
		}
		
		if(c==0) {
			System.out.println("It is a Prime Number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
}

public class Q3 {
	public static void main(String[] args) {
		testclass obj=new testclass();
		System.out.println("Enter number to be checked");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		obj.display(x);
		
	}

}
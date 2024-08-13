package finalpackage;

import aggregation.Details;

public class Animal {
	// final int a=10; if you give final variable cannot be changed 
	public void meth(){
		a=5;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Animal obj=new Animal();
		obj.meth();
}
}

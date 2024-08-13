package Inheritance;

public class Hierachy3 extends HierachyExample {
	public void ChildTwo(){
		System.out.println("My second one");
	}
	public static void main(String[] args) {
		Hierachy3 obj=new Hierachy3();
		obj.ChildTwo();
		obj.Parent();
		Hierachy2 obj1=new Hierachy2();
		obj1.Child();
		
	}

}

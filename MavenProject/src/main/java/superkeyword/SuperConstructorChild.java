package superkeyword;

public class SuperConstructorChild extends SuperConstructor {
	
	public SuperConstructorChild()
	{
		//super(); if not given super word also it works
		System.out.println("Hi");
		
	}
	public static void main(String[] args) {
		
SuperConstructorChild obj=new SuperConstructorChild();
	}

}

package superkeyword;

public class SuperVariableChild extends SuperVariableParent{
	String a="Merin";
	
	public void method()
	{
		System.out.println("Variables are"+super.a);
		System.out.println("Variables are"+a);
	}
	
	public static void main(String[] args) {
		
		SuperVariableChild obj=new SuperVariableChild();
	obj.method();
	}

}

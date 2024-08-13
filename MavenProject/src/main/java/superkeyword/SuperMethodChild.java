package superkeyword;

public class SuperMethodChild extends SuperMethod {
	public void methodone () {
		System.out.println("Hi");
		super.methodone();
	}

	public static void main(String[] args) {
		SuperMethodChild obj=new SuperMethodChild();
		obj.methodone();

	}

}

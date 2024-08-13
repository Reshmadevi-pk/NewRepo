package Inheritance;

public class MethOverloading {

	public void add() {
		System.out.println("add");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		MethOverloading obj=new MethOverloading();
				obj.add();
		        obj.add(2,3);
		
	}

}

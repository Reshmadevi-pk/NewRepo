package abstraction;

public class Rose2 extends Flower1 {
	
	public void run()
	{
		System.out.println("reshma");
	}
	public static void main(String[] args) {
		Flower1 obj=new Rose1();
				obj.run();
				obj.meth();
		
	}
}

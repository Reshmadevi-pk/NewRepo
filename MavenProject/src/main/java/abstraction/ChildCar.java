package abstraction;

public class ChildCar extends Vehicle1 {
public void run() {
	System.out.println("run");
}
	public static void main(String[] args) {
		ChildCar obj=new ChildCar();
		obj.run();
		obj.meth();

	}

}

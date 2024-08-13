package Inheritance;

public class ClassC extends ClassB{
	public void place()
	{
		System.out.println("Family");
	}

	public static void main(String[] args) {
	
		ClassC obj=new ClassC();
		obj.Show();
		obj.Display();
		obj.place();

	}

}

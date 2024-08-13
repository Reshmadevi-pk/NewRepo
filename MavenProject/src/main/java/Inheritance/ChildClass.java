package Inheritance;

public class ChildClass extends ParentClass{
public void Display()
{System.out.println("Name");}
	public static void main(String[] args) {
	ChildClass obj=new ChildClass();
	obj.Display();
	obj.Show();
}
}
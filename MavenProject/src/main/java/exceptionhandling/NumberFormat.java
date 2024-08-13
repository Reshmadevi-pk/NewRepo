package exceptionhandling;

public class NumberFormat {
	public void meth()
	{
	 try {
		 String a="java";
		 int c=Integer.parseInt(a);
	 }	
		catch(NumberFormatException obj)
	 {
		System.out.println("Exception handled");
		System.out.println(obj);
	 }
	 
	 
	}
	

	public static void main(String[] args) {
		NumberFormat obj1=new NumberFormat();
     obj1.meth();
	}

}

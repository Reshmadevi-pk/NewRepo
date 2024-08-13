package exceptionhandling;

public class ArithmeticException {
	public void meth(){
		try
		{
		 int a=10/0;//arithmetic exception
			
		}
		
		catch(Exception obj) {
			
			System.out.println("Exception handled");
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		
		ArithmeticException obj1=new ArithmeticException();
		obj1.meth();
	}

}

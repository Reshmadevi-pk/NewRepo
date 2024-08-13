package exceptionhandling;

public class NullPointerExceptionProgram {
	public void meth()
	{
	 try {
		String a=null;
		System.out.println(a.length());
	 }	
		catch(NullPointerException obj)
	 {
		System.out.println("Exception handled");
		System.out.println(obj);
	 }
	 finally {
		 System.out.println("hai");
	 }
	}
	

	public static void main(String[] args) {
		NullPointerExceptionProgram obj1=new NullPointerExceptionProgram();
      obj1.meth();
	}

}

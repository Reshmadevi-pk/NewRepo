package exceptionhandling;

public class Arrayexceptionprogram {

	public void meth(){
		try
		{
		 int a[]=new int[5];
		 a[7]=6;//array index out of bound exception
			
		}
		
		catch(Exception obj) {
			
			System.out.println("Exception handled");
			System.out.println(obj);
		}
	}

	public static void main(String[] args) {
		
		Arrayexceptionprogram obj1=new Arrayexceptionprogram();
		obj1.meth();
	}

}
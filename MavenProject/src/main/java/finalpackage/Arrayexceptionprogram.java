package finalpackage;

public class Arrayexceptionprogram {

	public void meth(){
		try
		{
		 int b[]=new int[5];
		 b[7]=6;
			
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
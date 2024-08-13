package exceptionhandling;

public class LicenceExp {
	
	public void test(int age) throws LicenceException
	{
		if(age<18)
		{
			throw new LicenceException("Not Eligible");

		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) throws LicenceException {
		LicenceExp obj=new LicenceExp();
		obj.test(15);

	}

}

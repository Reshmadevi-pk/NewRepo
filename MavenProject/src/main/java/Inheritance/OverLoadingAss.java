package Inheritance;

public class OverLoadingAss {
	public void add(float a,int b) {
		System.out.println (+a+","+b);
	}
	public void methodTwo(float c,int d) {
		float sum=c+d;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		OverLoadingAss obj=new OverLoadingAss();
				obj.add(5.0f,6);
		        obj.methodTwo(2.0f,2);
		
	}

}


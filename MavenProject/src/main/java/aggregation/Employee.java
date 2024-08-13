package aggregation;

public class Employee {
	
	int id;
	String name;
	Details detailsobj;
	
	public Employee(int id,String name,Details detailsobj)
	{this.id=id;
	this.name=name;
	this.detailsobj=detailsobj;}
	
public void meth() {
	
	System.out.println(id+","+name);
	System.out.println(detailsobj.city+" "+detailsobj.state+" "+detailsobj.country);
}
	public static void main(String[] args) {
		Details obj=new Details("Thrissur","Kerala","India");
	    Employee objone=new Employee(2,"sou",obj);
		objone.meth();

	}

}

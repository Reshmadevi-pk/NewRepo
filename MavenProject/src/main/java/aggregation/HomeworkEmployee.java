package aggregation;

public class HomeworkEmployee {
	
	String job;
    int salary;
    String company;
    HomeworkDetails HomeworkDetailsobj;
    

    public HomeworkEmployee(String job,int salary,String company,HomeworkDetails HomeworkDetailsobj)
	{this.job=job;
	this.salary=salary;
	this.company=company;
	this.HomeworkDetailsobj=HomeworkDetailsobj;} 
	
public void meth() {
	
	System.out.println(job+","+salary+","+company);
	System.out.println(HomeworkDetailsobj.name+" "+HomeworkDetailsobj.id+" "+HomeworkDetailsobj.age);
}
	public static void main(String[] args) {
		HomeworkDetails obj1=new HomeworkDetails("anoop",781294,30);
		HomeworkDetails obj2=new HomeworkDetails("Reshma",781295,34);
		HomeworkEmployee obj3=new HomeworkEmployee("senior executive",1234,"cognizant",obj1);
		HomeworkEmployee obj4=new HomeworkEmployee("senior executive",1234,"cognizant",obj2);
		obj3.meth();
		obj4.meth();

	}

}
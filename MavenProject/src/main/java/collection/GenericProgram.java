package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericProgram {

	public static void main(String[] args) {
		
		List<Integer> obj=new ArrayList<Integer>();
	
		obj.add(5);
		obj.add(4);
		obj.add(3);
		
		System.out.println(obj);//gives as a array list [123]
  for(int obj1:obj) {
	  System.out.println(obj1);
  }
	}

}

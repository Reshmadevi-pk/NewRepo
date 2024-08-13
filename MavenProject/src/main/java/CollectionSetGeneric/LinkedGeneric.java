package CollectionSetGeneric;

import java.util.LinkedList;

public class LinkedGeneric {

	public static void main(String[] args) {
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("Anoop");
		obj.add("Asoop");
		obj.add("rnoop");
		//obj.removeFirst();//first element remove
		//obj.removeLast();////first element remove
		
		
		//obj.addLast("navami");
		//obj.addFirst("reshma");
		
		System.out.println(obj.getFirst());//get the first name
		System.out.println(obj.getLast());//get the first name
		

	}

}

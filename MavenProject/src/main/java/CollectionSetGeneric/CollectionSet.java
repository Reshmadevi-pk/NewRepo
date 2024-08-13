package CollectionSetGeneric;

import java.util.ArrayList;

public class CollectionSet {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Reshma");
		obj.add("Anoop");
		obj.add("Kou");
//System.out.println(obj);
obj.set(2, "Reshma");
System.out.println(obj);
	}

}

package CollectionSetGeneric;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetLinkedClass {

	public static void main(String[] args) {
		Set<Integer>obj=new LinkedHashSet<Integer>();

		obj.add(20);
		obj.add(40);
		obj.add(70);
		obj.add(80);
		System.out.println(obj);
		
	}

}

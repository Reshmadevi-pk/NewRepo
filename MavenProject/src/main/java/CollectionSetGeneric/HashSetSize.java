package CollectionSetGeneric;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSize {

	public static void main(String[] args) {
		HashSet<String> obj=new HashSet<String>();

		obj.add("Reshma");
		obj.add("Anoop");
		obj.add("Shyama");
		obj.add("Master");
		
	
	Iterator itr=obj.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

	}


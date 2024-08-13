package CollectionSetGeneric;

import java.util.HashSet;

public class HashSetRemove {

	public static void main(String[] args) {
	HashSet<String> obj=new HashSet<String>();

		obj.add("Reshma");
		obj.add("Anoop");
		obj.add("Shyama");
		obj.add("Master");
		
		obj.remove("Reshma");
		System.out.println(obj);
	}

}

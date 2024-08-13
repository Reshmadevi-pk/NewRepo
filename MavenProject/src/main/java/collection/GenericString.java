package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericString {

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Maya");
		obj.add("Nithya");
		obj.add("Jeeva");
		obj.add("Riya");
		//System.out.println(obj.get(2));
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}

}

package HashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo04 {
	public static void main(String[] args) {
		ArrayList<String> firstName = new ArrayList();
		firstName.add("Shubham");
		firstName.add("Aditya");
		firstName.add("Akash");
		firstName.add("Bhupendra");
		firstName.add("Ashish");

		ArrayList<String> lastName = new ArrayList();
		lastName.add("Sadavarte");
		lastName.add("Shinde");
		lastName.add("Gaikwad");
		lastName.add("Bhagat");
		lastName.add("Shelke");

		HashMap hm = new HashMap<>();
		hm.put(01, firstName);
		hm.put(02, lastName);
		
		ArrayList al = new ArrayList(hm.values());
		Iterator itr = al.iterator();
		
		Iterator itr01 = firstName.iterator();
		Iterator itr02 = lastName.iterator();
		
		while(itr01.hasNext()) {
		System.out.print(itr01.next()+" ");
		System.out.print(itr02.next());
		System.out.println();
		}
		
		

	}

}

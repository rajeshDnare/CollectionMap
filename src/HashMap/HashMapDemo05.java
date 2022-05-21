package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo05 {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("gaav", "rajesh");
		hm.put("naav", "ankita");
		hm.put("paav", "vedant");
		hm.put("name", "nare");

		ArrayList<String> al = new ArrayList<>(hm.values());
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		Set<String> set = hm.keySet();
		
		for (String string : set) {
			System.out.print(hm.get(string) + " ");
		}
		System.out.println();
		Iterator<String> itr01 = set.iterator();
		while (itr01.hasNext()) {

			System.out.print(hm.get(itr01.next())+" ");
		}

	}

}

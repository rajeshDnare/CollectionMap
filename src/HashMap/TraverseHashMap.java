package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TraverseHashMap {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(01, "navin");
		hm.put(02, "pravin");
		hm.put(03, "janya");

		Set set = hm.entrySet();
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

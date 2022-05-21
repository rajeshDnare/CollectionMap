//map of collection
//print the element of map of collection
package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo3 {
	public static void main(String[] args) {
		ArrayList al01=new ArrayList<>();
		al01.add("rajesh");
		al01.add("ankita");
		al01.add("vedant");
		
		ArrayList al02=new ArrayList<>();
		al02.add("riyansh");
		al02.add("vaishnav");
		
		
		HashMap hm=new HashMap();
		hm.put(1, al01);
		hm.put(2, al02);
		
		
		
		//method 01
//		ArrayList keys=new ArrayList(hm.values());
//		Iterator itr=keys.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//method 02
		Set keys=hm.keySet();
		for (Object key : keys) {
			System.out.println(hm.get(key));
		}
		
		//method 03
//		Set keys=hm.keySet();
//		Iterator itr=keys.iterator();
//		while(itr.hasNext()) {
//			System.out.println(hm.get(itr.next()));
//		}
		
		
		
		
	}

}

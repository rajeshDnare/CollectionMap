//mrthods to itrerate over an HashMap;
package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo02 {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		
		hm.put(3, "rajesh");
		hm.put(4, "ankita");
		hm.put(5, "nilesh");
		hm.put(8, 25);
		hm.put(9, true);
		hm.put(10, 'g');
		hm.put(2, "riyansh");
		
		//method 01
//		ArrayList keys=new ArrayList(hm.values());
//		Iterator itr=keys.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//method 02
//		Set keys=hm.keySet();
//		for (Object key : keys) {
//			System.out.println(hm.get(key));
//		}
		
		//method 03
//		Set keys=hm.keySet();
//		Iterator itr=keys.iterator();
//		while(itr.hasNext()) {
//			System.out.println(hm.get(itr.next()));
//		}
		
		
		
		
	}

}

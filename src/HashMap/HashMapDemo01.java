package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(0, "Rajesh");
		hm.put(1, "Rajesh");
		hm.put(2, "Rajesh");
		hm.put("raj", "Rajesh");
		hm.put(null, null);
		hm.put(null, null); //null keys are allowed only once, while multiple null values are allowed
		hm.put(4, null);
		hm.put(5, null);
		
		System.out.println(hm);
		System.out.println(hm.get(2));
		
//		int a1=hm.size();
//		System.out.println(a1);
		
//		boolean a2=hm.isEmpty();
//		System.out.println(a2);
		
//		hm.put(4, "Nare");
//		System.out.println(hm);
		
//		Object a3=hm.get(4);
//		System.out.println(a3);
		
//		boolean a4=hm.containsKey(3);
//		System.out.println(a4);
		
//		boolean a5=hm.containsValue("Rajesh");
//		System.out.println(a5);
		
//		Object a6=hm.remove(03);
//		System.out.println(a6);
		
//		boolean a7=hm.remove(03, "Rajesh");
//		System.out.println(a7);
		
//		Set a8=hm.keySet();
//		System.out.println(a8);
		
//		Set a9=hm.entrySet();
//		System.out.println(a9);
		
//		Collection a10=hm.values();
//		System.out.println(a10);
		
//		hm.putAll(hm);
//		System.out.println(hm);
		
//		hm.clear();
		
		
	}

}

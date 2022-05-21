package LinkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo01 {
	public static void main(String[] args) {
		LinkedHashMap m=new LinkedHashMap();
		m.put(0, "Rajesh");
		m.put(1, "Rajesh");
		m.put(2, "Rajesh");
		m.put(3, "Rajesh");
		m.put(null, null);
		m.put(null, null); //null keys are allowed only once, while multiple null values are allowed
		m.put("raj", null);
		m.put(5, null);
		
		System.out.println(m);
		
		System.out.println(m.get(2));
		
//		int a1=m.size();
//		System.out.println(a1);
		
//		boolean a2=m.isEmpty();
//		System.out.println(a2);
		
//		m.put(4, "Nare");
//		System.out.println(m);
		
//		Object a3=m.get(4);
//		System.out.println(a3);
		
//		boolean a4=m.containsKey(3);
//		System.out.println(a4);
		
//		boolean a5=m.containsValue("Rajesh");
//		System.out.println(a5);
		
//		Object a6=m.remove(03);
//		System.out.println(a6);
		
//		boolean a7=m.remove(03, "Rajesh");
//		System.out.println(a7);
		
//		Set a8=m.keySet();
//		System.out.println(a8);
		
//		Set a9=m.entrySet();
//		System.out.println(a9);
		
//		Collection a10=m.values();
//		System.out.println(a10);
		
//		m.putAll(m);
//		System.out.println(m);
		
//		m.clear();
		
	}

}

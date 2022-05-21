package treeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo01 {

	public static void main(String[] args) {
		TreeMap m = new TreeMap();
		m.put(0, 10);
		m.put(1, 20);
		m.put(2, 30);
		m.put(3, 40);
		m.put(4, 50);
		System.out.println(m.get(0));

//		Object a1=m.ceilingEntry(1);
//		System.out.println(a1);

//		Object a2=m.ceilingKey(1);
//		System.out.println(a2);

//		m.clear();

//		Object a3=m.clone();
//		System.out.println(a3);

//		boolean a4=m.containsKey(2);
//		System.out.println(a4);

//		boolean a5=m.containsValue(10);
//		System.out.println(a5);

//		Set a6=m.descendingKeySet();
//		System.out.println(a6);

//		Map a7=m.descendingMap();
//		System.out.println(a7);

//		Set a8=m.entrySet();
//		System.out.println(a8);

//		Entry a9=m.firstEntry();
//		System.out.println(a9);

//		Object a9=m.firstKey();
//		System.out.println(a9);

//		Entry b1=m.floorEntry(40);
//		System.out.println(b1);

//		Object b2=m.floorKey(4);
//		System.out.println(b2);

//		Object b3=m.higherEntry(2);
//		System.out.println(b3);

//		Object b4=m.lowerEntry(3);
//		System.out.println(b4);

//		Object b5=m.higherKey(2);
//		System.out.println(b5);

//		Object b6=m.lowerKey(3);
//		System.out.println(b6);

//		Object b7=m.floorEntry(4);
//		System.out.println(b7);

//		System.out.println(m.floorKey(3));

//		Entry c1=m.pollFirstEntry();
//		System.out.println(c1);

//		Entry c2=m.lastEntry();
//		System.out.println(c2);

//		Object c2=m.lastKey();
//		System.out.println(c2);

//		Object c3=m.headMap(3);
//		System.out.println(c3);

//		Object c4=m.headMap(3, false);
//		System.out.println(c4);

//		Set c5=m.navigableKeySet();
//		System.out.println(c5);

//		m.replace(2, 50);
//		System.out.println(m);

//		Object c6=m.remove(1);
//		System.out.println(c6);

//		boolean c7=m.remove(1, 10);
//		System.out.println(c7);

//		boolean c8=m.replace(1, 20, 200);
//		System.out.println(c8);
//		System.out.println(m);

//		System.out.println(m.size());

//		Map c9=m.subMap(2, 4);
//		System.out.println(c9);

//		Map c10=m.subMap(2, false, 4, false);
//		System.out.println(c10);

//		Map d1=m.tailMap(3);
//		System.out.println(d1);

//		Map d2=m.tailMap(3, true);
//		System.out.println(d2);

	}

}

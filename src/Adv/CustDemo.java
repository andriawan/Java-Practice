package Adv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CustDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testArrayAsList();
		
		Cust s = new Cust();
		s.Id = 29;
		Cust b = new Cust();
		Cust m = s;
		
		System.out.println(s.equals(b));
		System.out.println();
		System.out.println(s.hashCode());
		System.out.println(b.hashCode());
		System.out.println(m.hashCode());

	}
	
	public static void testHashSet(){
		Set<Cust> customers = new HashSet<Cust>();
		
		Cust id1 = new Cust();
		id1.setId(1);
		customers.add(id1);
		
		Cust id2 = new Cust();
		id2.setId(2);
		customers.add(id2);
		
		Cust id3 = new Cust();
		id3.setId(1);
		customers.add(id3);
		
		Iterator<Cust> i = customers.iterator();
		
		while (i.hasNext()) {
			Cust cust = i.next();
			
			System.out.println("keranjang no-" + cust.hashCode() + " Idnya: " + cust.Id);
			
		}
	}
	
	public static void testHashMap(){
		
		HashMap<String, List<Cust>> customerByCity = new HashMap<String, List<Cust>>();
		
		List<Cust> jakartaCust = new ArrayList<Cust>();
		
		Cust a = new Cust();
		a.setId(10);
		jakartaCust.add(a);
		
		Cust b = new Cust();
		b.setId(11);
		jakartaCust.add(b);
		
		customerByCity.put("jakarta", jakartaCust);
		
		List<Cust> surabayaCust = new ArrayList<Cust>();
		
		Cust c = new Cust();
		c.setId(12);
		surabayaCust.add(c);
		
		Cust d = new Cust();
		d.setId(13);
		surabayaCust.add(d);
		
		customerByCity.put("surabaya", surabayaCust);
		
		Set<String> keys = customerByCity.keySet();
		
		Iterator<String> iterator = keys.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.hasNext());
			String key = iterator.next();
			List<Cust> customers = customerByCity.get(key);
			for (int i = 0; i < customers.size(); i++) {
				Cust customer = customers.get(i);
				
				System.out.println("Kota: " + key + ", Customer id: " + customer.getId());
			}
			
			
		}
		
	}
	
	public static void testTreeSet(){
		
		Set<Cust> customers = new TreeSet<Cust>();
		
		Cust a = new Cust();
		a.setId(7);
		customers.add(a);
		
		Cust b = new Cust();
		b.setId(8);
		customers.add(b);
		
		Cust c = new Cust();
		c.setId(6);
		customers.add(c);
		
		Cust d = new Cust();
		d.setId(-2);
		customers.add(d);
		
		Cust e = new Cust();
		e.setId(90);
		customers.add(e);
		
		Iterator<Cust> i = customers.iterator();
		
		while (i.hasNext()) {
			Cust current = i.next();
			System.out.println("keranjan no : " + current.hashCode() + " idnya : " + current.getId());
			
		}
		
		
	}
	
	
	public static void testSortList() {
		
		List<Cust> customers = new ArrayList<Cust>();
		
		Cust a = new Cust();
		a.setId(29);
		customers.add(a);
		
		Cust b = new Cust();
		b.setId(23);
		customers.add(b);
		
		Cust c = new Cust();
		c.setId(26);
		customers.add(c);
		
		Cust d = new Cust();
		d.setId(24);
		customers.add(d);
		
		System.out.println("sebelum sorting");
		for (int i = 0; i < customers.size(); i++) {
			System.out.println("index ke-" + i + " : " + customers.get(i).getId());
		}
		
		System.out.println("-------------------------------------------");
		
		Collections.sort(customers);
		
		System.out.println("sesudah sorting");
		for (int i = 0; i < customers.size(); i++) {
			System.out.println("index ke-" + i + " : " + customers.get(i).getId());
		}
		
	}
	
	public static void testArrayAsList() {
		String[] names = {"Irwan","daras","Zizeh","Amel"};
		List<String> nameList = Arrays.asList(names);
		
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
	}

}
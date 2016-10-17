package Adv;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static Integer init = 4;
	static String space = " ";
	static List<String> list = new ArrayList<String>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		testEquals();
		System.out.println("cek" + args);
		//listModel();
		//gcTest();
		//trySome();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "string dari class Main";
	}
	
	public static void gcTest(){
		
		Runtime rt = Runtime.getRuntime();
		System.out.println("full memory: " + rt.totalMemory());
		
		for (int i = 0; i < 1000000; i++) {
			
		}
		
		System.out.println("memory allocated before GC: " + rt.freeMemory());
		System.gc();
		System.out.println("memory allocated after GC: " + rt.freeMemory());
	}
	
	public static void trySome(){
		
		for (int i = 1; i < init; i++) {
			for (int j = 0; j < init - i; j++) {
				System.out.print(space);
			}
			
			for (int j2 = 1; j2 <= i*2-1 ; j2++) {
				System.out.printf("%c",64 + j2);
			}
			
			System.out.println();
			
		}
		
		Integer x = new Integer(3);
		
		Main v = new Main();
		
		Double result = Math.pow(18, 45);
		
		
		System.out.println(result);

		System.out.println(v.hashCode());
		System.out.println(result.getClass().getName());
		
		if (x instanceof Object){
			System.out.println("you are object");
		}else{
			System.out.println("what are you?");
		}
		 System.out.println(v.toString());
	}
	
	public static void listModel(){
		
		list.add("irwan");
		list.add("Daras");
		list.add("Amel");
		list.add("Azizeh");
		list.add("Jihad");
		list.add("Putri");
		
		System.out.println("isi dari list: ");
		for (int i = 0; i < list.size(); i++) {
			
			System.out.println("index ke - " + i + " : " + list.get(i));
			
		}
		
		System.out.println();
		System.out.println("Total : " + list.size() + " Orang");
		System.out.println();
	}
	
	public static void adOne(){
		list.add("dsef");
	}
	
	public static void testEquals(){
		
		String b = new String("irwan");
		String c = new String("irwan");
		
		boolean state = b == c;
		boolean state2 = c.equals(b);
		
		System.out.println(state);
		System.out.println(state2);
	}
	
}
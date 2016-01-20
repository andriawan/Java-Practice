package object_oriented_programming;

public class Person {
	public String a1 = "Muhammad Irwan Andriawan";
	public String nim = "F31130181";
	public String gender = "Male";
	
	public String a2 = "Muhammad Irwan Andriawan";
	public String nim2 = "F31130181";
	public String gender2 = "Male";
	
	
	public void showProfileA1(){
		System.out.println("Name	= " + a1);
		System.out.println("ID	= "+ nim);
		System.out.println("Gender 	= "+ gender);
		System.out.println("-----------------------------------------");
	}
	
	public void showProfileA2(){
		System.out.println("Name	= " + a2);
		System.out.println("ID	= "+ nim2);
		System.out.println("Gender 	= "+ gender2);
	}
	
	public static void main(String[] args){
		Person aku = new Person();
		aku.showProfileA1();
		aku.showProfileA2();
	}

}
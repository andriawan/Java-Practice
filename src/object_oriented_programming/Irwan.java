package object_oriented_programming;

class Andriawan {
	
	private String someoneHeLikes;
	public Andriawan(){//ini namanya konstruktor default
		this.someoneHeLikes = "Daras";		
	}
	public Andriawan(String someoneHeLikes){//ini namanya konstruktor dengan parameter
		this.someoneHeLikes = someoneHeLikes;
	}
	public String tellLove() {//ini namanya fungsi karena mengembalikan nilai (return)
		return someoneHeLikes;
		
	}
	
	public String getHer() {
		return someoneHeLikes;
	}

}

class Irwan {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) { //main method. metode yang dieksekusi kompiler
		// TODO Auto-generated method stub
		Andriawan action = new Andriawan();
		System.out.println("Someone he like is " + action.tellLove());
		Andriawan action2 = new Andriawan("G");
		System.out.println("Someone he like is " + action2.tellLove());
		System.out.println(System.err);

	}

}

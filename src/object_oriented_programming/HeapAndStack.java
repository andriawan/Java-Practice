package object_oriented_programming;

public class HeapAndStack {
	
	//instance variable (Heap Memory)
	private long id = 0;
	private String nama = null;

	/**
	 * @param args
	 */
	//main() is in stack memory 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HeapAndStack obj1;
		HeapAndStack obj2;
		HeapAndStack obj3;
		
		obj1 = new HeapAndStack();
		obj1.setId(100);
		obj1.setNama("irwan");
		
		obj2 = new HeapAndStack();
		obj2.setId(300);
		obj2.setNama("daras");
		System.out.println("nama obj2 " + obj2.getNama() );
		
		obj3 = obj2;
		obj3.setNama("rina");
		System.out.println("nama obj3 " + obj3.getNama() );
		
		System.out.println("nama obj2 " + obj2.getNama() );

	}

	public long getId() {
		return id;
	}

	public void setId(long id) { // local variable id is in stack memory
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) { // local variable id is in stack memory
		this.nama = nama;
	}

}

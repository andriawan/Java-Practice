package first_trial;

public class FirstTrialOne {

	/**
	 *
	 * My First Trial in Java started at 12:41 PM on Monday
	 * July 13,2015
	 * Andriawan
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Wold");
		
		int x = 20;
		int y = 30;
		int c = y % x;
		
		System.out.println("Hasil =" + c);
		
		/*
		 * Bagian if and else if
		 * 
		 * important to remember about (operational relation) in IF conndition
		 * == means equal to
		 * != means not equal
		 * >  means greater than
		 * <  means less than
		 * >= means greater than or equal to
		 * <= means less than or equal to
		 *  
		 */
		
		int a = 3000;
		int b = 3000;
		
		if(a < b){
			System.out.println("siip");
		}else if(a == b){
			System.out.println("podo");
		}else if(a > b){
			System.out.println("siip");
		}
		
		/*
		 * bagian FOR an Loop
		 */
		
		//for(initil value; condition; increment/decrement)
		for(int v = 0; v >= 10; v++){
			// v++ equals to v = v + 1
			System.out.println("v = " + v);
		}
		
	}

}

package Case_example;

public class Second_case_example {

	/**
	 * Application of Arrays String type and for condition
	 */
	public static void main(String[] args) {
		String [] nums = {"10","20","30","40"};
		int total = 0;
		
		for(String temp : nums){
			total = total + Integer.parseInt(temp);
		}
		 System.out.println("Total = " + total);
                 
                for(int a=3; a < 4; a++){
                    System.out.println(a);
                }
                
                int b = 3 + 2;
                String bx= Integer.toString(b);
                System.out.println(bx);
                System.out.println(bx + b);
	}

}

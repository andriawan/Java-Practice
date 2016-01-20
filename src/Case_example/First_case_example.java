package Case_example;

public class First_case_example {

	/**
	 * Thursday July 15, 2015
	 * Andriawan
	 * Tax Counting program
     * @param args
	 */
	public static void main(String[] args) {
		double salary = 160000;
		double tax = 3.0;
		
		if(salary<= 15000){
			tax = salary * .10;
		}else if (salary <= 40000) {
			tax = salary * .20;
		}else {
			tax = salary * .30;
		}
		
		System.out.println("tax = "+ tax);

	}

}

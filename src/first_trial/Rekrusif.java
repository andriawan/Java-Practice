package first_trial;

public class Rekrusif {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//triangle(890);
		System.out.println("faktorial " + FAKTORIAL(20));

	}
	
	public static int triangle(int n) {
		int bilangan = 0;
		if (n == 1) {
			bilangan = 1;
			System.out.println("bilanan ke - " + n + " adalah " + bilangan);
		} else {
			bilangan = n + triangle(n - 1);
			System.out.println("bilanan ke - " + n + " adalah " + bilangan);
		}
		return (bilangan);
	}
	
	public static double FAKTORIAL(double bilangan) {
		if (bilangan == 0) {
			return 1;
		} else {
			bilangan = bilangan * FAKTORIAL(bilangan -1);
		}
		return bilangan;
	}

}

package first_trial;

public class While_references {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = -10;
		while (x <= 0){
			System.out.println("x = " + x);
			// x++ equals to x = x + 1
			//x++;
			//x = x + 1;
			x += 1;
		}

	}

}

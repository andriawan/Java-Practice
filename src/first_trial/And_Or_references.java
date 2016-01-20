package first_trial;

public class And_Or_references {

	/**
	 * contains if condition
	 * && is symbol of AND
	 * || is symbol of OR
	 */
	public static void main(String[] args) {
		int x,y;
		x = 10;
		y = -10;
		
		if(x>0 && y>0){
			System.out.println("positive number");
		}
			else if(x>0 || y>0){
			System.out.println("one of them are positive");
			}
			else{
			System.out.println("negative number");
			}
				
	}

}

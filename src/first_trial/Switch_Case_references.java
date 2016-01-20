package first_trial;

public class Switch_Case_references {

	/**
	 * since java 7, switch can hanle type of string data
	 * so int can be replaced with String x = "string"
	 */
	public static void main(String[] args) {
		int x = 2;
		String b = "me";
		
		switch(x){
		
		case 0:
			System.out.println("value is 0");
			break;
		case 1:
			System.out.println("value is 1");
			break;
		case 2:
			System.out.println("value is 2");
			break;
		case 3:
			System.out.println("value is 3");
			break;
		default:
			System.out.println("No Value");
			break;
				
		}
		
		switch (b) {
		case "me":
			System.out.println("it is me :D");
			break;
		case "you":
			System.out.println("you");
			break;
		default:
			System.out.println("human");
			break;
		}
	}

}

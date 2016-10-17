package first_trial;

public class Throws {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] id = new int[3][9];
		
		id[0][0] = 4;
		id[0][1] = 4;
		
		id[1][0] = 5;
		id[1][1] = 5;
		
		id[2][0] = 4;
		id[2][1] = 4;
		
		
		for (int i = 0; i < id.length; i++) {
			for (int j = 0; j < id[i].length; j++) {
				System.out.println(id[i][j]);
//				System.out.println(id[1].length);
			}
		}

		
//		try {
//			URI uri = new URI("http://www.e.com");
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		// TODO Auto-generated method stub
//		try {
//			getArrays();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Array error");
//		}

	}

	public static void getArrays() throws ArrayIndexOutOfBoundsException {
		String[] string = {"hello"};
		System.out.println(string[1]);
	}
	

}

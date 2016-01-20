package first_trial;

public class String_references {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String x ="Irwan Andriawan";
		//after variabel x there is a dot(.) which means methods for string x
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2, 7));
		System.out.println(x.charAt(4));
		
		String y ="29";
		String m ="30";
		
		//wrapper classes is method to convert string to integer
		int a= Integer.parseInt(y) + 2;
		System.out.println(a);
		double b = Double.parseDouble(m)/12; 
		System.out.println(b);

	}

}

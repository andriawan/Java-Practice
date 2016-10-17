package first_trial;

public class Arrays_references {

	/**
	 * Arrays makes data look organized
	 */
	public static void main(String[] args) {
		
		/*instead we write data like this
		int a = 10;
		int b = 20;
		int c,d,e;
		c =30; d=40; e=50;
		it seems not effective
		*/

		//with arrays it can be more effective like below
		int[]a={10,20,30,40,50};
		/*arrays start with a[0], in this case it will be:
		 * a[0] = 10
		 * a[1]	= 20 
		 * a[2] = 30
		 * a[3] = 40
		 * a[4] = 50
		 */		
		System.out.println(a[0]+" "+a[3]);
		
		//enhanced with for condition
		//for(int b:a){
		//System.out.println(b);
		
		int [] x = new int[5];
		//default of array content is 0
		x[1]=30;
		x[2]=44;
		for (int d:x)
		System.out.println(d);
		
		System.out.println("_____________");
		//string arrays
		//default of string array content is null
		String [] ar = new String[5];
		ar[0]="me";
		ar[1]="you";
		
		for(String xx:ar){
			System.out.println(xx);
		}
		
		}
	
	}


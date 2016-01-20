package first_trial;

public class Arrays_2D_references {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [][] TwoDim = new int [4][3];
		/*
                dalam array multi dimensi, contoh 2D [][], array pertama 
                adalah baris atau row yang kedua adalah kolom atau column
                */ 
		// TwoDim [2][1] = 50;
		//System.out.println(TwoDim[2][1]);
		
		int temp = 20;
		for(int i=0; i<4;i++){
			for(int j=0; j<3;j++){
				TwoDim[i][j]= temp;
				temp += 10;
				System.out.print(TwoDim[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}

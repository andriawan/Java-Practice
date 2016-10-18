package exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchThrows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			suckMethod();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("suck");

	}
	
	public static void suckMethod() throws FileNotFoundException, IOException{
		
		FileInputStream fs = new FileInputStream("buka.txt");
		System.out.println("kode broken :)");
		fs.close();
	}

}
package exercise;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MainTest {
	
	private Locale d = new Locale("id","ID");
	
//================================== Exercise 1 =========================================//
	public void doInput() {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Jumlah Inputan: ");
		int jumlah = s.nextInt();
		System.out.println();
		
		String[] Nama = new String[jumlah];
		int[] Nilai = new int[jumlah];
		
		for (int i = 0; i < jumlah; i++) {
			 System.out.print("Nama: ");
			 Nama[i] = s.next().toString();
			 System.out.print("Nilai: ");
			 Nilai[i] = s.nextInt();
			 System.out.println("");
		}
		
		int sum = 0;
		for (int i = 0; i < Nilai.length; i++) {
			sum += Nilai[i];
		}
		
		System.out.println("Total : " + sum);
		int Rata2 = sum/Nilai.length;
		System.out.println("Rata2 : " + Rata2);
		int max = getMaxVal(Nilai);
		int min = getMinVal(Nilai);
		System.out.println("Nilai Tertinggi : " + max );
		System.out.println("Nilai Terendah : " + min );
		s.close();
		
		System.out.println();
		System.out.print("Kembali ke Program (y/n) ?");
		String decision = s.next();
		
		switch (decision) {
		case "y":
			doInput();
			break;
		case "n":
			System.out.println("terima kasih telah menggunakan program ini");
		default:
			break;
		}
	}
	
	public int getMaxVal(int[] init){
		int max = init[0];
		for (int i = 0; i < init.length; i++) {
			if (init[i] > max) {
				 max = init[i];
			}
		}
		
		return max;
	}
	
	public int getMinVal(int[] init){
		int min = init[0];
		for (int i = 0; i < init.length; i++) {
			if (init[i] < min) {
				 min = init[i];
			}
		}
		
		return min;
	}
//================================== Exercise 1 =========================================//
	
	
//================================== Exercise 2 =========================================//
	
	public void doCountUangLembur(){
		Scanner s = new Scanner(System.in);
		
		double uangLembur = 0;
		String jabatan = null;
		double jamLembur = 0;
		
		System.out.print("Kode Level : ");
		int codeExucte = s.nextInt();
		System.out.print("Jumlah jam lembur : ");
		jamLembur = s.nextInt();
		
		
		
		switch (codeExucte) {
		case 1:
			
			jabatan = "Manager";
			uangLembur = 500000;
			break;
			
		case 2:
			jabatan = "Supervisior";
			uangLembur = 300000;
			break;
		case 3:
			jabatan = "Staff";
			uangLembur = 200000;
			break;

		default:
			System.out.println("mohon maaf, anda bukan pekerja");
			doDecision();
			System.exit(0);
			break;
		}
		
		NumberFormat money = NumberFormat.getCurrencyInstance(d);
		double totalUangLembur = jamLembur * uangLembur;
		String moneyID = money.format(totalUangLembur);
		
		System.out.println();
		System.out.println("Anda adalah " + jabatan + ", Total Uang Lembur : " + moneyID);
		System.out.println();
		
		doDecision();
		
		
		s.close();
	}
	
	public void doDecision(){
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Kembali ke Program (y/n) ?");
		String decision = s.next();
		
		switch (decision) {
		case "y":
			System.out.println("=====================================");
			doCountUangLembur();
			break;
		case "n":
			System.out.println("terima kasih telah menggunakan program ini");
			break;
		default:
			break;
		}
		
		s.close();
	}

//================================== Exercise 2 =========================================//
	
}
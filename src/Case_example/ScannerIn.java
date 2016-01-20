package Case_example;

import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScannerIn {
	
	public static void main(String[] arg0){
		
	 Test ts = new Test();
	 Alphabet Alp2 = new A();
	 
	 ts.As(Alp2);
	 
	 Alphabet in[]= new Alphabet[3];
	 in[0]= new A();
	 in[1]= new B();
	 in[2]= new C();
	 
	 for (int x=0;x<3;x++){
		 in[x].say();
	 }
	}
}

class Test{
	public void As(Alphabet d){
		d.say();
	}
}

abstract class Alphabet{
	abstract void say();
}

class A extends Alphabet{
	
	void say() {
		System.out.println("I am alphabet A");
	}
}

class B extends A{
	
	void say(){
		System.out.println("I am alphabet B");
	}
	
}

class C extends B{
	
	void say(){
		System.out.println("I am alphabet C");
	}
}
// Based on Tutorial from Newboston @bucky
	
//----------------------------------------------------------------------------------------------------------------
//	PROGRAM JAVA GUI WITH SWING by Andriawan 04/01/2016 08:39 PM
//----------------------------------------------------------------------------------------------------------------	

		/*	public static void main(String[] arg0){
				
				GUI2 y = new GUI2();
				y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				y.setSize(500,200);
				y.setVisible(true);
				
				GUI xx = new GUI();
				xx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				xx.setSize(500,200);
				xx.setVisible(true);
				
				String fn = JOptionPane.showInputDialog("Masukan angka pertama:");
				String sn = JOptionPane.showInputDialog("Masukkan angka kedua:");
				
				int x = Integer.parseInt(fn);
				int y = Integer.parseInt(sn);
				int sum = x + y;
				
				JOptionPane.showMessageDialog(null, "hasilnya adalah " + sum, "Program Penjumlahan GUI",JOptionPane.PLAIN_MESSAGE);
			}
			
			}
			
			class GUI2 extends JFrame{
			
			private JTextField item1;
			private JTextField item2;
			private JTextField item3;
			private JPasswordField item4;
			
			public GUI2(){
				super("JAVA SWING PART2");
				setLayout(new FlowLayout());
				
				item1 = new JTextField(10);
				add(item1);
				
				item2 = new JTextField("Insert the text");
				add(item2);
				
				item3 = new JTextField("Uneditable",20);
				item3.setEditable(false);
				add(item3);
				
				item4 = new JPasswordField("Password");
				add(item4);
				
				handlerClass handler = new handlerClass();
				item1.addActionListener(handler);
				item2.addActionListener(handler);
				item3.addActionListener(handler);
				item4.addActionListener(handler);
				
				
			}
			
			private class handlerClass implements ActionListener {
			
				@Override
				public void actionPerformed(ActionEvent event) {
					// TODO Auto-generated method stub
					
					String string = "";
					
					if(event.getSource()== item1)
						string = String.format("field 1 : %s", event.getActionCommand());
					
					else if (event.getSource()== item2)
					string = String.format("field 1 : %s", event.getActionCommand());
					
					else if (event.getSource()== item3)
					string = String.format("field 1 : %s", event.getActionCommand());
					
					else if (event.getSource() == item4)
					string = String.format("field 1 : %s", event.getActionCommand());
					
					JOptionPane.showMessageDialog(null, string);
				}
				
			}
			}
			
			class GUI extends JFrame{
			
			private JLabel item1;
			
			public GUI(){
				
				super("Program JAVA GUI with SWING");
				setLayout(new FlowLayout());
				
				item1 = new JLabel("this is sentence");
				item1.setToolTipText("this is tooltips");
				add(item1);
				
				
			}
			}
		*/

//----------------------------------------------------------------------------------------------------------------
//	PROGRAM INHERITANCE CLASS by Andriawan 03/01/2016 08:47 PM
//----------------------------------------------------------------------------------------------------------------	
		
	
		/*	public static void main(String[] arg0){
				A a = new A();
				B b = new B();
				a.Init();
				b.Init();
			}
			}
			
			class A extends Alphabet{
			
			}
			
			class B extends Alphabet{
			public void Init(){
				System.out.println("i am alphabet B");
			}
			}
			
			class Alphabet{
			public void Init(){
				System.out.println("i am alphabet");
			}
			}
		*/

	
//----------------------------------------------------------------------------------------------------------------
//	PROGRAM FINAL KEYWORDS by Andriawan 03/01/2016 08:30 PM
//----------------------------------------------------------------------------------------------------------------	


		/*	public static void main(String[] arg0){
				Blu b = new Blu(55);
				for(int i=0;i<5;i++){
				b.add();
				System.out.printf("%s",b);
				}
			}
			
			class Blu{
			private int sum;
			private final int NUMBER;
			
			public Blu(int x){
				NUMBER = x;
			}
			
			public void add(){
				sum+=NUMBER;
			}
			
			public String toString(){
				return String.format("sum = %d\n", sum);
			}
			}
		*/

//----------------------------------------------------------------------------------------------------------------
//	PROGRAM STATIC KEYWORDS by Andriawan 03/01/2016 08:02 PM
//----------------------------------------------------------------------------------------------------------------	


		/*	public static void main(String[] arg0){
				Bin member1 = new Bin("Irwan","Andriawan");
				Bin member2 = new Bin("Daras","Tika");
				Bin member3 = new Bin("Amelia","Eka");
				Bin member4 = new Bin("Siti","Azizeh");
				
				System.out.println();
				System.out.println(member2.getFirstName());
				System.out.println(member2.getLastName());
				System.out.println(member2.getMembers());
				
				System.out.println(Bin.getMembers());
			}
			
			
			class Bin{
			private String first;
			private String last;
			private static int members=0;
			
			public Bin(String fn, String ln){
				first=fn;
				last =ln;
				members++;
				System.out.printf("Constructor for %s %s, members in the club: %d\n", first, last, members);
				
			 }
			
			public String getFirstName(){
				return first;
			}
			
			public String getLastName(){
				return last;
			}
			
			public static int getMembers(){
				return members;
			}
			}
		*/
	
	
//----------------------------------------------------------------------------------------------------------------
//	PROGRAM ENUMERATION by Andriawan 03/01/2016 06:39 PM
//----------------------------------------------------------------------------------------------------------------	

		// have to import java.util.EnumSet;

		/*	public static void main(String[] arg0){
				for (Blind people: Blind.values())
				System.out.printf("%s\t%s\t%s\n",people, people.getDesc(),people.getAge());
				System.out.println("\nand the range of the enum is\n");
				
				for (Blind people: EnumSet.range(Blind.Daras, Blind.Dinda)) 
				System.out.printf("%s\t%s\t%s\n",people, people.getDesc(),people.getAge());
			}
			
			
			enum Blind{
				irwan("boy","22"),
				Azizeh("girl","20"),
				Daras("girl","21"),
				Amel("girl","20"),
				Yulia("girl","20"),
				Avintya("girl","22"),
				Dinda("girl","21");
			
			private final String desc;
			private final String age;
			
			Blind(String description, String howOld){
				desc = description;
				age = howOld;
			}
			
			public String getDesc(){
				return desc;
			}
			
			public String getAge(){
				return age;
			}
			
			}
		*/


//----------------------------------------------------------------------------------------------------------------
//	PROGRAM COMPOSITION by Andriawan 03/01/2016 04:16 PM
//----------------------------------------------------------------------------------------------------------------	

				
		/*	public static void main(String[] arg0){
				Nix n = new Nix(4, 5, 2);
				Banana b = new Banana("Irwan",n);
				
				System.out.println(b);
			}
			
			}
			
			class Banana{
			
			private String name;
			private Nix birthday;
			
			public Banana(String theName, Nix theDate){
				name = theName;
				birthday = theDate;
			}
			
			public String toString() {
				return String.format("My Name is %s , My Birthday is %s", name,birthday);
			
			}
			
			}
			
			class Nix{
				private int month;
				private int day;
				private int year;
			
				public Nix(int m, int d, int y){
				month = m;
				day = d;
				year = y;
			
				System.out.printf("The constructor for this is %s\n", this);
			}
			
			public String toString() {
				return String.format("%d/%d/%d", month,day,year);
			
			}
			
			}
			
		*/
	
//----------------------------------------------------------------------------------------------------------------
//	PROGRAM TO STRING by Andriawan 03/01/2016 01:33 PM
//----------------------------------------------------------------------------------------------------------------	
		
		/*	public static void main(String[] arg0){
				Nix n = new Nix(4, 5, 2);
				System.out.println(n.toString());
			}
			
			}
		
			class Nix{
				private int month;
				private int day;
				private int year;
			
			public Nix(int m, int d, int y){
				month = m;
				day = d;
				year = y;
				
				System.out.printf("The constructor for this is %s\n", this);
			}
			
			public String toString() {
				return String.format("%d/%d/%d", month,day,year);
				
			}
		}*/
	

//----------------------------------------------------------------------------------------------------------------
//	PROGRAM MULTIPLE CONSTRUCTOR by Andriawan 03/01/2016 01:33 PM
//----------------------------------------------------------------------------------------------------------------

		/*	public static void main(String[] arg0){
				Banana b = new Banana();
				Banana b2 = new Banana(3);
				Banana b3 = new Banana(3,6);
				Banana b4 = new Banana(6,7,8);
				
				System.out.printf("%s\n",b.toMilitary());
				System.out.printf("%s\n",b2.toMilitary());
				System.out.printf("%s\n",b3.toMilitary());
				System.out.printf("%s\n",b4.toMilitary());
		*/


		/*	class Banana{	
				public int hour;
				public int minute;
				public int second;
				
				public Banana(){
					this(0,0,0);
				}
				
				public Banana(int h){
					this(h,0,0);
				}
				
				public Banana(int h, int m){
					this(h,m,0);
				}
				
				public Banana(int h, int m, int s){
					setTime(h, m, s);
				}
			
				private void setTime(int h, int m, int s) {
					setHour(h);
					setMinute(m);
					setSecond(s);
					
				}
			
				private void setHour(int h) {
					hour = ((h >= 0 && h < 24)? h:0);
				}
			
				private void setMinute(int m) {
					minute = ((m >= 0 && m < 60)? m:0);
				}
			
				private void setSecond(int s) {
					second = ((s >= 0 && s < 60)? s:0);
				}
				
				public int getHour(){
					return hour;
				}
				
				public int getMinute(){
					return minute;
				}
				
				public int getSecond(){
					return second;
				}
				
				public String toMilitary(){
					return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
				}
			}
			
		*/


//----------------------------------------------------------------------------------------------------------------
// PROGRAM MILITARY AND GENERAL CLOCK by Andriawan 03/01/2016 12:05 PM
//----------------------------------------------------------------------------------------------------------------

		/*	public static void main(String[] args) {		
			Banana clock = new Banana();
			clock.setTime();
			System.out.println(clock.toMilitary());
			System.out.println(clock.toString());
			}*/

		/*	class Banana{
			private int hour;
			private int minute;
			private int second;
			private Scanner i;
			
			public void setTime(){
				int h, m, s;
				i = new Scanner(System.in);
				System.out.println("PROGRAM PENGATUR JAM");
				System.out.println("------------------------");
				System.out.print("Masukkan Jam: ");
				h = i.nextInt();
				System.out.print("Masukkan Menit: ");
				m = i.nextInt();
				System.out.print("Masukkan Detik: ");
				s = i.nextInt();
				System.out.println("------------------------");
				System.out.println("Hasil jam yang diatur adalah:");
				
				hour = ((h >= 0 && h < 24) ? h:0);
				minute = ((m >= 0 && m < 60) ? m:0);
				second = ((s >= 0 && s < 60) ? s:0);
			}
			
			public String toMilitary(){
				return String.format("%02d:%02d:%02d",hour,minute,second);
			}
			
			public String toString(){
			return String.format("%d:%02d:%02d %s", ((hour == 0 || hour == 12)? 12:hour%12),minute,second,(hour < 12 ? "AM":"PM"));
			}
			
			}
		*/


//----------------------------------------------------------------------------------------------------------------
// PROGRAM VARIABLE LENGTH ARGUMENTS by Andriawan 02/01/2016 01:17 PM
//----------------------------------------------------------------------------------------------------------------

		/*	public static void main(String[] args) {		
			System.out.println(average(7,8,8,7,67,8,6,65,65,4,54));
			}
			
			public static int average(int...numbers ){
			int total=0;
			for (int x:numbers)
				total+=x;
			System.out.println("banyaknya angka dimasukkan: " + numbers.length);
			return total/numbers.length;
			 
			}
		*/


//----------------------------------------------------------------------------------------------------------------
//	PROGRAM ARRAYS LOOP MULTIDIMENSI with METHOD by Andriawan 02/01/2016 11:08 AM
//----------------------------------------------------------------------------------------------------------------

		/*	public static void main(String[] args) {		
			int arr[][]={{300,444,666,777,888},{6,8,99,33}};
			int arr2[][]={{44},{66,87,90},{444,555,433,5445}};
			
			System.out.println("first multi Arrays dengan length " + arr.length);
			display(arr);
			
			System.out.println("Second multi Arrays dengan length " + arr2.length);
			display(arr2);			
			
			}
			
			public static void display(int x[][]){
			for (int row=0; row < x.length;row++){
				for(int column=0; column <x[row].length; column++){
					System.out.print(x[row][column]+"\t");
					System.out.print(x[row].length);
				}
				System.out.println();
			}
			}
		*/


//----------------------------------------------------------------------------------------------------------------
//	PROGRAM SIMPLE ARRAYS LOOP with METHOD by Andriawan 02/01/2016 11:08 AM
//----------------------------------------------------------------------------------------------------------------
		/*	public static void main(String[] args) {		
			int arr[]={300,444,666,777,888};
			change(arr);
			for(int g: arr){
				System.out.println(g);
			}
			
			}
			
			public static void change(int x[]){
			for (int count=0; count<x.length;count++){
				x[count]+=999;
			}
			}
		*/


//----------------------------------------------------------------------------------------------------------------
// PROGRAM ARRAYS LOOP with FOR by Andriawan 02/01/2016 10:54 AM
//----------------------------------------------------------------------------------------------------------------

		/*	int arr[]={12,14,56,788,889,34};
			int total=0;
			
			for(int x: arr){
				total+=x;
			}
			
			System.out.println(total);
		*/


//----------------------------------------------------------------------------------------------------------------
// PROGRAM ARRAYS INDEX by Andriawan 01/01/2016 22:46 PM
//----------------------------------------------------------------------------------------------------------------

		/*	int arr [] = {12,33,455,654,88,9,88};
			System.out.println("Index\tValue");
			int sum=0;
			
			int as []=new int [7];
			
			for (int count=0; count<arr.length;count++){	
				System.out.println(count + "\t" + arr[count]);
				sum = sum + arr[count];
			}
			 System.out.println(sum);
		*/


//----------------------------------------------------------------------------------------------------------------
// PROGRAM ARRAYS FREQUENCY by Andriawan 01/01/2016 22:46 PM
//----------------------------------------------------------------------------------------------------------------

		/*	Random c = new Random();
			int acc [] = new int [7];
			
			for (int roll=1;roll<1000;roll++){
				++acc[1+c.nextInt(6)];
			}
			
			System.out.println("Face\tFrequency");
			for(int face=1;face<acc.length;face++){ //method .length pada array sederhana mengacu pada jumlah kolom
				System.out.println(face + "\t" + acc[face]);
			}
			
		*/


//----------------------------------------------------------------------------------------------------------------
// PROGRAM MATH CLASS by Andriawan 01/01/2016 21:51 PM
//----------------------------------------------------------------------------------------------------------------
	
	/*	Scanner c = new Scanner(System.in);
		double a,b;
		System.out.print("Masukan Angka: ");
		a = c.nextDouble();
		b = c.nextDouble(); 
		System.out.println(Math.max(a,b));
	*/

//----------------------------------------------------------------------------------------------------------------
// PROGRAM RANDOM NUMBER by Andriawan 01/01/2016 21:51 PM
//----------------------------------------------------------------------------------------------------------------
		/*	Random dice = new Random();
			
			int number;
			
			for (int i=0; i<10;i++){
				number = 1 + dice.nextInt(9999);
				System.out.println("you got " + number);
			}
		*/
			

//----------------------------------------------------------------------------------------------------------------
// PROGRAM NILAI RATA2 by Andriawan 01/01/2016 21:14 PM
//----------------------------------------------------------------------------------------------------------------
		/*	input = new Scanner(System.in);
			int initial = 0;
			int grade;
			int average;
			int total= 0;
			int allNum;
			
			System.out.println("PROGRAM NILAI RATA2");
			System.out.println("--------------------");
			System.out.print("Masukan jumlah nilai yang akan di hitung: ");
			allNum = input.nextInt();
			System.out.println("-----------------------------");
			
			while (initial < allNum){
				System.out.print("masukan nilai ke " + (initial+1) + ": ");
				grade = input.nextInt();
				total= total + grade;
				initial++;
			}
			
			average = total/allNum;
			System.out.println("-----------------------------");
			System.out.println("Rata-rata nilai adalah " + average);
		*/


//----------------------------------------------------------------------------------------------------------------
// PROGRAM SHORTCUT CONDITION by Andriawan 01/01/2016 20:50 PM
//----------------------------------------------------------------------------------------------------------------
		/*	input = new Scanner(System.in);
			int a;
			System.out.println("PROGRAM SHORTCUT CONDITION");
			System.out.println("--------------------");
			System.out.print("Masukkan angka: ");
			a = input.nextInt();
			
			System.out.println(a > 60 ? "old boy":"nice boy");
		*/


//----------------------------------------------------------------------------------------------------------------
// PROGRAM SWITCH by Andriawan 01/01/2016 20:35 PM
//----------------------------------------------------------------------------------------------------------------
		/*	input = new Scanner(System.in);
			int a;
			System.out.println("PROGRAM WHILE LOOP");
			System.out.println("--------------------");
			System.out.print("Masukkan angka: ");
			a = input.nextInt();
			
			System.out.println("");
			System.out.println("Hasil");
			System.out.println("");
			System.out.println("--------------------");
			
			
			while (a <= -2){
				System.out.print(a + " ");
				a++;
			}
			
			System.out.println("");
			System.out.println("--------------------");
		*/

//----------------------------------------------------------------------------------------------------------------
// PROGRAM IF by Andriawan 01/01/2016 20:15 PM
//----------------------------------------------------------------------------------------------------------------
		/*	input = new Scanner(System.in);
			double fnum, lnum;
			System.out.println("PROGRAM IF");
			System.out.println("--------------------");
			System.out.print("Masukkan Nilai pertama: ");
			fnum = input.nextDouble();
			System.out.print("Masukkan Nilai kedua: ");
			lnum = input.nextDouble();
			System.out.println("--------------------");
			System.out.println("HASIL");
			if (fnum < lnum && fnum < 60){
				System.out.println("Angka pertama lebih kecil dari angka kedua " + fnum + " < " + lnum);
				System.out.println("Angka pertama lebih kecil dari 60");
				System.out.println("ANDA GAGAL UJIAN :(");
			}else if(fnum == lnum){
				System.out.println("Angka pertama dan angka kedua sama");
			}else if(fnum > lnum && fnum >= 60){
				System.out.println("Angka pertama lebih besar dari angka kedua " + fnum + " > " + lnum);
				System.out.println("Angka pertama lebih besar atau sama dengan 60");
				System.out.println("SELAMAT!!! ANDA LULUS UJIAN :)");
			}else if(fnum < lnum && fnum >= 60){
				System.out.println("Angka pertama lebih kecil dari angka kedua " + fnum + " > " + lnum);
				System.out.println("Angka pertama lebih besar atau sama dengan 60");
				System.out.println("SELAMAT!!! ANDA LULUS UJIAN :)");
			}else{
				System.out.println("error!!!!");
			}	
		*/		

//----------------------------------------------------------------------------------------------------------------
// PROGRAM PENJUMLAHAN by Andriawan 01/01/2016 20:15 PM
//----------------------------------------------------------------------------------------------------------------
	/*	input = new Scanner(System.in);
		double fnum, lnum, answer;
		System.out.println("PROGRAM PENJUMLAHAN");
		System.out.println("--------------------");
		System.out.print("Masukkan angka pertama: ");
		fnum = input.nextDouble();
		System.out.print("Masukkan angka kedua: ");
		lnum = input.nextDouble();
		answer = fnum + lnum;
		System.out.println("Hasilnya adalah: " + answer);
	*/

//----------------------------------------------------------------------------------------------------------------
// PROGRAM SWITCH by Andriawan 01/01/2016 20:15 PM
//----------------------------------------------------------------------------------------------------------------

	/*	input = new Scanner(System.in);
		String a,b,c, answer;
		a = "a) Muhammad Irwan Andriawan  ";
		b = "b) Rina Diah Daras Tika  "; 
		c = "c) Andre Virgiawan Diaz Tamami   ";
		System.out.println("PROGRAM SWITCH");
		System.out.println("--------------------");
		System.out.println("Soal");
		System.out.println("");
		System.out.println("Siapakah siswa Politeknik Negeri Jember angkatan 2013 yang memiliki NIM F31130182 ?");
		System.out.println("");
		System.out.print(a);
		System.out.print(b);
		System.out.println(c);
		System.out.println("");
		System.out.println("--------------------");
		System.out.print("ketikan jawaban(a/b/c): ");
		answer = input.next();
		
		switch(answer){
		
		case "a":
			System.out.println("salah");
			break;
		case "b":
			System.out.println("benar dia adalah :) " + b);
			break;
		case "c":
			System.out.println("salah");
			break;
		default:
			System.out.println("ketikan hanya a,b dan c. Jangan yang lain >:)");
			break;
		
		}
	*/	

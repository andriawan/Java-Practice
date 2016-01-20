package object_oriented_programming;

/*
 * The Basic Understanding of Java Structure
 * class must be defined first before everything inside
 * basic form of syntax >>> "[Modifier] class class_identifier""
 * 
 */

public class Class_and_Object_references { //[Modifier] class class_identifier
	/* [Modifier] class class_identifier"
	 * [Modifier] must be one of (private, public, protected, final, static and default)
	 * 
	 */
	
	/*
	 * this is object class and this call another class (blueprint class)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_Class sam,bu,bi;
		
		sam = new Number_Class();
		bu  = new Number_Class();
                bi  = new Number_Class();
                
                bi.b=4000;
                bi.c=7800;
                bi.multipleNum();

		bu.b=3338;
		bu.c=7878;
		bu.multipleNum();		
		
		sam.b=33;
		sam.c=44;
		sam.multipleNum();
				

	}

}

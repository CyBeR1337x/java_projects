package TASK_06;

public class Class1 {
	public int pubSimpleVar1;
	private int priSimpleVar1;
	int defSimpleVar1;
	
	public static int pubStaticVar1;
	private static int priStaticVar1;
	static int defStaticVar1;
	
	public static final int pubFinalVar1 = 1;
	private int priFinalVar1 = 1;
	final int defFinalVar1 = 1;
	
	public void normal_method() {
		priSimpleVar1 = 1;
		pubSimpleVar1 = 1;
		defSimpleVar1 = 1;
		
		pubStaticVar1 = 1;
		priStaticVar1 = 1;
		defStaticVar1 = 1;
		
		//THESE WILL GIVE ERROR, BECAUSE OF FINAL
		//pubFinalVar1 = 1; 
		//priFinalVar1 = 1;
		//defFinalVar1 = 1;
		
		Class1 c1 = new Class1();
		c1.priSimpleVar1 = 1;
		c1.pubSimpleVar1 = 1;
		c1.defSimpleVar1 = 1;
		
		c1.pubStaticVar1 = 1;
		c1.priStaticVar1 = 1;
		c1.defStaticVar1 = 1;
		
		//ERROR
//		c1.defFinalVar1 = 1;
//		c1.priFinalVar1 = 1;
//		c1.pubFinalVar1 = 1;
		

	}
	
	public static void static_method() {
		// ERROR DUE TO NON-STATIC ATTRIBUTES
//		priSimpleVar1 = 1;
//		pubSimpleVar1 = 1;
//		defSimpleVar1 = 1;
		
		pubStaticVar1 = 1;
		priStaticVar1 = 1;
		defStaticVar1 = 1;
		
		//THESE WILL GIVE ERROR, BECAUSE OF FINAL
		//pubFinalVar1 = 1; 
		//priFinalVar1 = 1;
		//defFinalVar1 = 1;
		
		Class1 c1 = new Class1();
		//THESE WILL WORK BECAUSE WE ARE ACCESSING 
		// THRO THE OBJECT..
		c1.priSimpleVar1 = 1;
		c1.pubSimpleVar1 = 1;
		c1.defSimpleVar1 = 1;
		
		c1.pubStaticVar1 = 1;
		c1.priStaticVar1 = 1;
		c1.defStaticVar1 = 1;
		
		//ERROR
//		c1.defFinalVar1 = 1;
//		c1.priFinalVar1 = 1;
//		c1.pubFinalVar1 = 1;
	}


}

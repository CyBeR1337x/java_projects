package TASK_06;

public class Class2 {
		
	public void normalMethod() {
				
		Class1 obj = new Class1();
		//obj.priSimpleVar1 = 1;	//Error
		obj.pubSimpleVar1 = 1;	
		obj.defSimpleVar1 = 1;	//Error
		
		//obj.priStaticVar1 = 1;	//Error
		obj.pubStaticVar1 = 1;
		obj.defStaticVar1 = 1;	//Error
		
		//obj.pubFinalVar1 = 1;	//Error
		//obj.priFinalVar1 = 1;	//Error
		//obj.defFinalVar1 = 1;	//Error
	}
	
	public static void staticMethod() {		
		Class1 obj = new Class1();
		//obj.priSimpleVar1 = 1;	//Error
		obj.pubSimpleVar1 = 1;
		obj.defSimpleVar1 = 1;	//Error
		
		//obj.priStaticVar1 = 1;	//Error
		obj.pubStaticVar1 = 1;
		obj.defStaticVar1 = 1;	//Error
		
//		obj.pubFinalVar1 = 2;	//Error
//		obj.priFinalVar1 = 2;	//Error
//		obj.defFinalVar1 = 2;	//Error
		
		System.out.println();
	}
}

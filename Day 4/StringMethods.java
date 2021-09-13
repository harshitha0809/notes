
public class StringMethods {
public static void main(String[] args) {
	
	
	
	String name="fiserv";//literal immutable  98
	
	String name1="fiServ";//literal immutable  66   heap--->SCP-->duplicates are not allowed


	System.out.println(name==name1);//true/false
	
	System.out.println(name.equals(name1));//true
	
	System.out.println(name.compareTo(name1));//0
	
	//string class methods
	
		//return -ve if obj1 one has to come before obj2  
		//return +ve if obj1 one has to come after  obj2  
		//return 0 if both the objects are same 
	
	
	String orgName=new String("Fiserv");
	String orgName1=new String("Fiserv");
	
	System.out.println(orgName==orgName1);//false
	
	System.out.println(orgName.equals(orgName1));//true
	
	System.out.println(orgName.compareTo(orgName1));//0
	
}
}

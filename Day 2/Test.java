	class Test{//data members+memeber functions 
		int salary=12345;//global variable and instance  4 bytes  object creation
	static double height=5.6;//global variable and static  
		public static void main(String args[]){
			byte age=12;//local variables
			float marks=12.7869765461f;
			char gender='M';
			boolean condition=true;//false  single line comments
		
			System.out.println(marks+"welcome to java"+age);
			System.out.println(Test.height);
			
			
			Test obj=new Test();//memory created 
			System.out.println(obj.salary);//instance variable access
		}
		
		}//.class
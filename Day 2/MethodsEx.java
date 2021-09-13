	class MethodsEx{//data members+memeber functions 
		int result;
		int salary=12345;//global variable and instance  4 bytes  object creation
	static double height=5.6;//global variable and static  
			void addition(int a,int b)//instance method with params 
							{	
							result=a+b;
							System.out.println("addition of two numbers "+result);
							}
		static	int sub(int a,int b)//static method with param and retur type
							{	
							return a-b;
							}
				void mul()//instance method with out parms & return type
							{
								int a=12;
								int b =12;
							System.out.println("mul of two numbers "+(a*b));
							}
		public static void main(String args[]){
			System.out.println("sub of two numbers : "+MethodsEx.sub(1,2));//static method calling
			System.out.println("sub of two numbers : "+MethodsEx.sub(123,211));
			boolean condition=true;//local variable
			System.out.println("fist printing statement"+condition);
			System.out.println(Test.height);
			
			MethodsEx obj=new MethodsEx();//memory created 
			System.out.println(obj.salary);//instance variable access
			obj.addition(111,22);//instance method calling
			obj.mul();
			obj.mul();
			obj.mul();
		}
		}//.class
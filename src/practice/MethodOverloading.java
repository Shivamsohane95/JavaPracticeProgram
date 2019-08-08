package practice;

 class MethodOverloading extends Methods {
	
	public static void main(String []a)
	{
		meth1(4,5);
		meth2("Sohane","Sohane");
		meth1(4,5,6);
		meth1(2,3.0,4);
		
	}
	static void meth1(int a,int b,int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	static void meth1(int a,double c,int d)
	{
		int e = (int) (a+c+d);
		System.out.println(e);
	}

}
  class Methods
 {
	static void meth1(int a,int b)
	 {
		 int c = a*b;
		 System.out.println(c);
	 }
	static void meth2(String a, String b)
	 {
		String add = a+b;
		System.out.println(add);
	 }
 }

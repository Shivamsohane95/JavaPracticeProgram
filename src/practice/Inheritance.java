package practice;

class Inheritance extends Practice{
	public static void main(String []a)
			{
		Inheritance pr = new Inheritance();
				pr.method1(5, 4);
				pr.method2("shivam", "sohane");
				Inheritance.method3(2, 3);
				pr.method4();
				
				
			}
	 static void shivam(int k,int p)
	{
		int d= k+p;
		System.out.println("Sum of k and p:"+d);
		pr2.method1(2, 2);
		int O = M*N;
		System.out.println(O);
	}
}

 class Practice {
	 
	   static Practice pr2 = new Practice();
	  static int N=5;
	static int M=7;
	
  public void method1(int a,int b) 
  {
	int sum = a+b;
	System.out.println("Sum of a+b:"+sum);
  }
  public void method2(String a,String b)
  {
	
	  String add = "";
	  add=a+b;
	  System.out.println("Combination of string a and b:"+add);
	  
  }
  static void method3(int a,int b)
  {
	  int c= a*b;
	  System.out.println("Multiplication:"+c);
  }
  void method4()
  { 
	  
	  Inheritance.shivam(6,6);
  }

}

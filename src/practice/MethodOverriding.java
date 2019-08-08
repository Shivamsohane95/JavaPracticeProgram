package practice;

class MethodOverriding extends Method {
	public static void main(String []a)
	{
		Method mt = new Method();
				
		mt.sum(5,5);
		mt.multiplication(2,3,4);
	}
	 void sum(int a,int b)
	{
		int c=a+b+5;
		System.out.println(c);
	}
	 void multiplication(int a,int b,int c)
	{
		int d = a*b+c;
		System.out.println(d);
	}

}
class Method
{
	 void sum(int a,int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	 void multiplication(int a ,int b,int c)
	{
		int d = a*b*c;
		System.out.println(d);
	}
}

package practice;

public class FunctionAndConstructor {

	public static void main(String[] args) {
		
		FunctionAndConstructor obj = new FunctionAndConstructor();
		obj.sum();
		obj.diffrence(5, 4);
		System.out.println("Multiplication of a*b:" +obj.multiply());
		System.out.println("Division of a*b:" +obj.division(12, 3));
		

	}

	public void sum()
	{
		int a =10;
		int b=20;
		int c = a+b;
		System.out.println("Sum of a and b:" +c);
	}
	public void diffrence(int a, int b)
	{
		int c =a-b;
		System.out.println("Difference of a and b:"+c);
	}
	public int multiply()
	{
		int a=5;int b=3,c;
		c=a*b;
		return c;
	}
	public int division(int a ,int b)
	{
		int c=a/b;
		return c;
	}
}

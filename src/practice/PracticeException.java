package practice;

public class PracticeException {

	public static void main(String[] args) throws Exception {
		
      divide(4,0);
      StringNum("shivam");
	}
	//Arithmetic Exception
public static void divide(int a, int b)
{
	try {
	int c = a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception Handled");
	}
}
//NumberFormateException
public static void StringNum(String s) throws Exception
{
	try {
	int i =Integer.parseInt(s);
	}
	catch(NumberFormatException e)
	{
		System.out.println("NumberFormatException handled");
	}
	finally {
		System.out.println("Should print");
	}
}

}

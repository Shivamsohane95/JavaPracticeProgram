package InterFace;

public class TestInterface {
public static void main(String []arg)
{
	Bank obj = new PNB();
	obj.getRateOfIntrest(4,3);
	Bank obj2 = new SBI();
	obj2.getRateOfIntrest(4,4);
}
}
interface Bank
{
	void getRateOfIntrest(int a, int b);
}
class PNB implements Bank
{

	@Override
	public void getRateOfIntrest(int a,int b)
	{
		int c = a+b;
		System.out.println("Rate of Interest of PNB: "+c+"%");
		
	}
	
}
class SBI implements Bank
{

	@Override
	public void getRateOfIntrest(int a,int b) {
		int c = a+b;
		System.out.println("Rate of Interest of PNB: "+c+"%");
		
	}
	
}

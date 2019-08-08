package practice;



public class TestBank {
	 
	public static void main(String []arg)
	{
		Bank obj = new PNB();
		System.out.println("Rate of interest: "+obj.getRateofinterest()+"%");
		Bank obj1 = new SBI();
		System.out.println("Rate of interest: "+obj1.getRateofinterest()+"%");
		Bank obj2 = new PNB();
		obj2.PrintName();
				
	}

}
 abstract class Bank {
	 abstract int getRateofinterest();
	 void PrintName()
	 {
		 System.out.println("Shivam Sohane");
	 }
 }
 class PNB extends Bank
 {

	@Override
	int getRateofinterest() {
		return 8;
	}
 }
	class SBI extends Bank{

	@Override
	int getRateofinterest() {
		
		return 7;
	}
	}

	

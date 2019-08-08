package practice;


public class TestAbstraction 
{
	public static void main(String []arg)
	{
		AbstractionArea obj = new Circle();
		obj.Area();
		AbstractionArea obj1 = new Rectangle();
		obj1.Area();
	
	}

}

 abstract class AbstractionArea {
	 abstract void Area();
	

}

 class Circle extends AbstractionArea {

	@Override
	void Area() {
		
		int r=4;
	    double pi=3.14;
	    double a = pi*r*2;
	    System.out.println("Area of Circle: "+a);
	}
 }
	class Rectangle extends AbstractionArea
	{
		@Override
		void Area() {
			int width=4;
		    int length=5;
		    int a = width*length;
		    System.out.println("Area of Rectangle: "+a);
	}


	
		
	}


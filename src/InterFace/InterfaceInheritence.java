package InterFace;

public class InterfaceInheritence {
public static void main(String []arg)
{
	Name obj = new Name();
	obj.PrintFName();
	obj.PrintLName();
}
}
interface shivam
{
	void PrintFName();
}
interface sohane extends shivam
{
	void PrintFName();
	default void PrintLName()
	{
		System.out.println("sohane");
	}
		
}
 
class Name implements sohane
{

	@Override
	public void PrintFName() {
		System.out.println("shivam");
	}
		
	}
	

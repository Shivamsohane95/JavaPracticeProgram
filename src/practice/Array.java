package practice;

public class Array {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] =10;
		a[1] =20;
		a[2] =30;
		a[3] =40;
		a[4] =50;
		try {
		a[5]=60;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled successfully");
		}
		//double b[] = {1,2,3,4};
		for(int i: a)
		{
		//for(int i=b.length-1;i>=0;i--)
		System.out.println(i);

	}

}
}

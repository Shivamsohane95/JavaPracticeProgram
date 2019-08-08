package practice;

public class Stringpractice1 {
//reverse a string on its place
	public static void main(String[] args) {
		String a = "shivam sohane kapil gupta Aditya Pratap Singh";
		String[] b= a.split(" ");
		System.out.println(a);
		for(int i=0;i<b.length;i++)
		{
			char[] arr = b[i].toCharArray();

		  for(int j=b[i].length()-1;j>=0;j--)
		{
			System.out.print(arr[j]);
		}
		  System.out.print(" ");
	}
	}
}

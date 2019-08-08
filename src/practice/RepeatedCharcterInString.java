package practice;

public class RepeatedCharcterInString {

	public static void main(String[] args) {
		String a = "shiva";
		char b;
		char d = 0;
		int i,j;
		char[] e = a.toCharArray();
		
		{
			
		}
		
		int[] c = new int[a.length()];
		for( i=0;i<a.length()-1;i++)
		{
		b= a.charAt(i);
		c[i]=b;
		for( j=a.length()-1;j>=0;j--)
		{
			d=e[j];
		}
		if(c[i]==d)
		{
			System.out.println(d);
		}
		}
		

	}

}

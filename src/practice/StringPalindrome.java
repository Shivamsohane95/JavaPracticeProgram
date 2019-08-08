package practice;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String a = scr.nextLine();
		String[] b = a.split(" ");
		String rev = "";
		for(int j=0;j<b.length;j++)
		{
			String spl = b[j];
			String rev1="";
		
		for(int i=spl.length()-1;i>=0;i--)
		{
		 rev1 = rev1+spl.charAt(i);
		 
		}
		rev = rev+rev1+" ";
		}
		System.out.println(rev);
//		if(rev.equals(a))
//		{
//			System.out.println("String is Palindrome");
//		}
//		else
//		{
//			System.out.println("String is not Palindrome");
//		}
		

	}

}

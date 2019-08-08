package practice;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int  num = scr.nextInt();
		int e = num;
		int rev=0;
		while(num!=0)
		{
			int a = num%10;
			rev = rev*10+a;
			num = num/10;
			
		}
		if(e==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
		System.out.println(rev);
	}

}

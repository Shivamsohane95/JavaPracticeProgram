package practice;

import java.util.Scanner;

public class AarmstrongNumber {
//A number is called an Armstrong number if it is equal to the cube of its each digit. for example, 153 is an Armstrong number because 153= 1+ 125+27 which is equal to 1^3+5^3+3^3. You need to write a program to check if given number is Armstrong number or not.


	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int x=num;
		int c=0;
		while(num!=0)
		{
			int a = num%10;
			int b = (int) Math.pow(a, 3);
			 c = c+b;
			num=num/10;
		}
		if(x==c)
		{
			System.out.println("Number is Aarmstrong Number");
		}
		else
		{
			System.out.println("Number is not Aarmstrong Number");
		}
		System.out.println(c);
	}

}



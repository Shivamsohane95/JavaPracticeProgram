package practice;

import java.util.Scanner;

public class DiamondP {

	public static void main(String[] args) {
		int i,j,num,l,k;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter any number : ");
	num = scr.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=num; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(l =2;l<=2*(i-k);l++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
			
		}

	}

}

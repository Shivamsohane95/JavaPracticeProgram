package practice;

import java.util.Scanner;

public class DiamondStar {

	public static void main(String[] args) {
		//int colunm=1;
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		int s=num;
		for(int i=1;i<=num;i++)
		{
						
			for(int j=num; j>i; j--)
			{
				
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				
				System.out.print("*");
				//System.out.print(" 1");
			}
			for(int l =2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int x=1;x<=s;x++)
		{
			for(int m=1;m<=x;m++)
			{
				System.out.print(" ");
			}
			for(int n=s;n>x;n--)
			{
				System.out.print("*");
			}
			for(int o=s;o>x+1;o--)
			{
				System.out.print("*");
			}
			System.out.println("");
			
			
		}

	}

}

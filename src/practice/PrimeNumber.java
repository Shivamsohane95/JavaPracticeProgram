package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		//check number is prime or not
		//int count =0;
//		for(int i=2;i<=num/2;i++)
//		{
//			if(num%i==0)
//			{
//			  count=1;
//			}
//		}
//		if(count==1)
//		{
//			System.out.println("Number is not prime");
//		}
//		else
//		{
//			System.out.println("Number is Prime");
//		}
		
		//Print prime number from 1 to n
         for(int i=1;i<=num;i++)
         {
        	 int count =0;
        	 for(int j=2;j<=i/2;j++)
        	 {
        		 if(i%j==0)
        		 {
        			 count=1;
        		 }
        	 }
        	 if(count==0)
        			{
        		      System.out.println(i);
        			}
        			
         }
        
	}

}

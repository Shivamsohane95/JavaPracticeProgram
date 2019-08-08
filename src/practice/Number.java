package practice;

import java.util.Scanner;

public class Number {
	
	
	
	public static void main(String []a)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch(num){
		//reverse the given string
			case 1:
			{
				String str1 = "shivam";
				String rev ="";
				for(int i=str1.length()-1;i>=0;i--)
				{
					 rev = rev+str1.charAt(i);
					
				}
				System.out.println(rev);
				break;
			}
			case 2:
				//reverse the given number
			{
				int number = 12345;
				int rev=0;
				int b;
				while(number!=0)
				{
					b= number%10;
					rev = rev*10+b;
					number = number/10;
				}
				System.out.println(rev);
				break;
			}
			//take the input string from keyboard and reverse it word by word
			case 3:
			{
				
				Scanner str = new Scanner(System.in);
				String name = str.nextLine();
				String[] spl = name.split(" ");
			    String rev="";
				
				for(int k=0;k<spl.length;k++)
				{
					String spl1 = spl[k];
				    String rev1 = "";
				
				for(int i=spl1.length()-1;i>=0;i--)
				{
					rev1 = rev1 + spl1.charAt(i);
					
				} 
				rev = rev+rev1+" ";
				}
				System.out.println(rev);
				break;
			}
			//reverse the array
			case 4:
			{
			 int[] s = {1,2,3,4,5};
			 String rev="";
		    
		    	 for(int i =s.length-1;i>=0;i--)
		    	 {
					rev = rev+s[i];
				 }
		     System.out.println(rev);
		     break;	
			 }
			case 5:
			{
				int n= 10;
				int b=1,c=1,d=0;
				for(int i=1;i<=n;i++)
				{
					b=c;
					c=d;
					d=b+c;
					System.out.println(d);
				}
			break;
			
			}
			case 6:
			{
				Scanner scr = new Scanner(System.in);
				int n = scr.nextInt();
				int x=0,y=1,z=0;
				for(int i=1;i<=n;i++)
				{
					x=y;
					y=z;
					z=x+y;
					System.out.println(z);
				}
				break;
				
			}
			
			 
			default:
				System.out.println("Not"); 
		
		
	}

	}}
	
package practice;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int number = scr.nextInt();
		switch(number)
		{
		case 1:
		{
			Scanner scr1 = new Scanner(System.in);
			int num= scr1.nextInt();
		// this is the rectangle with blank space proram
	int s=num;
	int i,j,k,l;
	for(j=1;j<=s;j++)
	{
		System.out.print("*");
	}
	System.out.println("");
	for(i=1;i<num-1;i++)
	{
		for(k=1;k<=1;k++)
		{
				System.out.print("*");
				
				for(l=2;l<num;l++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
		
		System.out.println("");
		}
	for(j=1;j<=num;j++)
	{
		System.out.print("*");
	}

	}
	break;
		case 2:
		{
			Scanner scr2 = new Scanner(System.in);
			int num = scr2.nextInt();
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
		break;
		case 3:
		{
			Scanner scr3 = new Scanner(System.in);
			String a = scr3.nextLine();
			char[] b = a.toCharArray();
			//int num = scr3.nextInt();
			for(int i=1;i<b.length;i++)
			{
				for(int j=b.length;j>i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=1;k++)
				{
					if(i==1)
					{
						System.out.print(b[0]);
					}
					else if(i==2)
					{
						System.out.print(b[1]);
						System.out.print(" ");
						System.out.print(b[2]);
					}
					else if(i==3)
					{
						System.out.print(b[3]);
						System.out.print(" ");
						System.out.print(b[4]);
						System.out.print(" ");
						System.out.print(b[5]);
					}
				}
				System.out.println("");
				
			}
			}
		break;
		case 4:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
		{
			Scanner scr4 = new Scanner(System.in);
			String a = scr4.nextLine();
			char[] b = a.toCharArray();
			//int num = scr4.nextInt();
			for(int i=0;i<b.length;i++)
			{
			for(int j=0;j<=i;j++)
			{
				System.out.print(b[i]);
			}
			System.out.println("");
			}
		}
		break;
		case 5:
//			A
//			AB
//			ABC
//			ABCD 
//			ABCDE
		{
//			Scanner scr4 = new Scanner(System.in);
//			String a = scr4.nextLine();
//			char[] b = a.toCharArray();
			for(int i=1;i<=5;i++)
			{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64));
			}
			System.out.println("");
			}
		}
		break;
		case 6:
//			A
//			BA
//			CBA
//			DCBA
//			EDCBA
		{
			
			for(int i=1;i<=5;i++)
			{
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+64));
				
			}
			System.out.println("");
			}
		}
		break;
		case 7:
			//user defind triangle
//			s
//			sh
//			shi
//			shiv
//			shiva
//			shivam
		{
			Scanner scr5 = new Scanner(System.in);
			String s = scr5.nextLine();
			char[] a = s.toCharArray();
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print(a[j]);
				}
				System.out.println("");
			}
		}
		break;
		case 8:
//			54321
//			5432
//			543
//			54
//			5

		{
			for(int i=1;i<=5;i++)
			{
				for(int j=5;j>=i;j--)
				{
					System.out.print(j);
				}
				System.out.println("");
			}
		}
		break;
		case 9:
			//Print Diamond of *
		{
			int  n=5;
			for(int i=1;i<n;i++)
			{
				for(int j=n;j>i;j--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++)
				{
					if(i==1||i==n||k==1||k==n)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				for(int l=2;l<=i;l++)
				{
					if(i==n||l==n||l==i)
					{
						
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
				System.out.println("");
				}
			for(int m=n-1;m>=1;m-- )
			{
				for(int o=m;o<n;o++)
				{
					System.out.print(" ");
				}
				for(int p=1;p<=m-1;p++)
				{
					if(p==1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				for(int q=1;q<=m;q++)
				{
					if(q==m)
					System.out.print("*");
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			}
		break;
		case 10:
			//Print pattern of 8(*)
		{ 
			int n=10;
			for(int r=1;r<=n;r++)
			{
				for(int t=1;t<=n;t++)
				{
					if(r==1||r==n||t==1||t==n)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			for(int u=1;u<=n;u++)
			{
				for(int v=1;v<=n;v++)
				{
					if(u==n||v==1||v==n)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println("");
		}
		}
		break;
		case 11:
//			   *       *
//		        *     *
//		         *   *
//		          * *
//		           *
//		          * *
//		         *   *
//		        *     *
//		       *       *
		{
			int n=5;
			
			for(int a=1; a<=n;a++)
			{
				System.out.print("       ");
				for(int b=1;b<a;b++)
				{
					System.out.print(" ");
				}
				for(int c=a;c<=n;c++)
				{
					if(c==a)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				for(int d=n-a;d>=1;d--)
				{
					if(d==1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			for(int e=2;e<=n;e++)
			{
				System.out.print("       ");
				for(int f=n;f>e;f--)
				{
					System.out.print(" ");
				}
				for(int g=1;g<=e;g++)
				{
					if(g==1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				for(int h=2;h<=e;h++)
				{
					if(e==2||h==e)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			
			
		}
		break;
		case 12:
		{
			Scanner scr6 = new Scanner(System.in);
			int n= scr6.nextInt();
			int s=n;
			System.out.print(" ");
			for(int i=1;i<=n;i++)
			{   
				for(int j=1;j<s-1;j++)
				{
					System.out.print("*");
				}
				s=s-n;
				System.out.println("");
				for(int k=1;k<=n;k++)
				{
					if(k==1||k==n)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println("");
			System.out.print(" ");
			for(int j=1;j<n-1;j++)
			{
				System.out.print("*");
			}
		}
		break;
		case 13:
//			1
//			23
//			456
//			78910
//			1112131415

		{
			int n=5;
			int num=1;
			for(int i=1;i<=n;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.print(num);
					num=num+1;
				}
				System.out.println("");
			}
		}
			
		

}
	}
}

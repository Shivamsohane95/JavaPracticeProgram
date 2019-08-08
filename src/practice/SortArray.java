package practice;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int arr[] = new int[5];
		//int temp[] = new int[5];
		int temp = 0;
		for(int i=0;i<5;i++)
		{
			arr[i]=scr.nextInt();
		}
		for(int m=1;m<arr.length;m++ )
		{
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]<=arr[j+1])
			{
				temp =arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		}
		for(int l=0;l<arr.length;l++)
		{
			System.out.print(arr[l]);
		}
		
	}
		
}


package practice;

import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		char[] arr = new char[10];
		Scanner scr = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=scr.next().charAt(0);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-1;j>i;j--)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}

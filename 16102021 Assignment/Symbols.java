package com.pack;
import java.util.Scanner;
public class Symbols
{
	int n;
	int count=0;
	char arr[]=new char[100];
	int readChar()
	{
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the size of the array");
			n=s.nextInt();
			System.out.println("enter the "+n+" elements:");
			for(int i=0;i<n;i++)
			{
				arr[i]=s.next().charAt(0);
			}
		}
		for(int i=0;i<n;i++)
		{
			if(Character.isAlphabetic(arr[i]))
			{
				continue;
			}
			else if(Character.isDigit(arr[i]))
			{
				continue;
			}
			else{
				count++;
			}
		}
		return count;
	}
	public static void main(String []args)
	{
		Symbols s1=new Symbols();
		System.out.println("the number of symbols that can be found in given array are:"+s1.readChar());
	}
}

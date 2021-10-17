package com.pack;
import java.util.Scanner;
import java.lang.Math;
public class Shuffles{
	int n,i,j,temp,rand;
	int arr[]=new int[100];
	void shuffle(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=s.nextInt();
		System.out.println("\nEnter "+n+" elements:");
		for(i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		System.out.println("\nThe Elements prior to sorting are:\n");
		System.out.print("[ ");
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ]\n");
		for(i=0;i<n;i++){
			for(j=0;j<n-1;j++){
				rand=(int)(Math.random()*n);
				temp=arr[rand];
				arr[rand]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println("The Elements after sorting are:\n");
		System.out.print("[ ");
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ]");
	}
	public static void main(String[] args){
        Shuffles ob=new Shuffles();
		ob.shuffle();
	}
}

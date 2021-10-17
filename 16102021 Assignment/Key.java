package com.pack;
import java.util.Scanner;
	public class Key{
		int n,key1,count=0;
		int arr[]=new int[100];
		boolean search(){
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the size of the array:");
			n=s.nextInt();
			System.out.println("Enter "+n+" elements:");
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			System.out.println("Enter a key to Search:");
			key1=s.nextInt();
			for(int i=0;i<n;i++){
				if(key1==arr[i]){
					break;
				}
				else{
					count++;
				}
			}
			if(count==n){
				return false;
			}
			else{
				return true;
			}
		}
		public static void main(String []args){
			Key ob=new Key();
			if(ob.search()){
				System.out.println("The key exists!!");
			}
			else{
				System.out.println("The key not exists!!");
			}
		}
	}


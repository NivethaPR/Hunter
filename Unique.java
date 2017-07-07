package Guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Unique {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int size=s.nextInt();
		int [] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("enter the index :");
		int index=s.nextInt();
		System.out.println("element in the "+index+" position");
		System.out.println(arr[index]);

	}

}

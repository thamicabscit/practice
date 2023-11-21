package javaproblems;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		//982249 
		

		
		
		
//		int n=9824;
//	   char[] ch=Integer.toString(n).toCharArray();
//	   
//	   Arrays.sort(ch);
//	   System.out.println(ch);


	

		
		//reversing digits
		int a,i,count=0;

		Scanner s= new Scanner(System.in);

		System.out.println("Enter a number");

		a=s.nextInt();

		   while (a > 0) {

		i= a % 10;

		System.out.print(i);

		  a = a / 10;

		}
	}
}

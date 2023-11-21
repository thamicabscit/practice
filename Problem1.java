package javaproblems;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int num=5674;
		int result=0;
		
		
	
		
			while(num!=0) {
			int remainder=num%10;
			if(remainder/2!=0)
			{
				 result+=(int) Math.pow(remainder,2);
				num=num/10;
			
				
				
				
				
				
			}
			
			else
			{
				result+=(int) Math.pow(remainder, 3);
				
				 
			}
			
		}
			
			System.out.println(result);
		

	}
}


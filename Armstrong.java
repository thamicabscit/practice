package javaprograms;

import java.util.Scanner;

//public class Armstrong {
//
//	public static void main(String[] args) {
//	
//	int	num=371,result=0;
//	int original=num;
//	while(num!=0)
//	{
//		int remainder=num%10;
//		result+=Math.pow(remainder,3);
//		num=num/10;
//		
//	}
//	if(result==original)
//	{
//		System.out.println("armstrong");
//	}
//	else
//	{
//		System.out.println("not armstrong");
//	}
//
//	}
//
//}


//armstrong numbers between ranges
public class Armstrong

{
	//to find the power which is the (length) of the digits
	public static int power(int num)
	{
		int len=0;
		while(num!=0)
		{
			len++;
			//to eliminate last digit
			num=num/10;
		}
		return len;
	}
	
	
	
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lowest number ");
		int low=sc.nextInt();
		System.out.println("Enter the highest number");
		int high=sc.nextInt();
		
		
	
		
		for(int num=low;num<=high;num++)
		{
		
			int temp=num;
			//calling power method to find power
			int len=power(num);
			int sum=0;
			//to find the armstrong number
			while(temp!=0)
			{
				int remainder=temp%10;
				 sum=sum+(int) Math.pow(remainder, len);
				 temp=temp/10;
				
				
			};
			if(sum==num)
			{
				System.out.println(num+" ");
			}
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
	

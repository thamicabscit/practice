package javaprograms;

public class swap {

//	public static void main(String[] args) {
//	 int a=10,b=20,temp;
//	 temp=a;
//	 a=b;
//	 b=temp;
//	 System.out.println(a+","+b);
//
//	}
	
	
	//without third variable
	//to get a sum in one of the two given numbers. 
	//The numbers can then be swapped using the sum and 
	//subtraction from the sum
	public static void main(String args[])
	{
		int a=10,b=20;
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a+" "+b);
		
		
		
	}

}

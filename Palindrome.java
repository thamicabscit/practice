package javaprograms;


//strings using reverse method
//public class Palindrome {
//
//	public static void main(String[] args) 
//	{
//		//declare string variable
//	 String mystring="anna";
//	 //create string buffer object and pass the string variable
//	 StringBuffer buffer=new StringBuffer(mystring);
//	 //reverse the object
//	 buffer.reverse();
//	 //convert the buffer object into string again and store 
//	 String data=buffer.toString();
//	 if(mystring.equals(data))
//	 {
//		System.out.println("palindrome"); 
//	 }
//	 else
//	 {
//		 System.out.println("not palindrome");
//	 }
//	 
//	 
//
//	}
//
//}

//without reverse method
//public class Palindrome
//{
//	public static void main(String[] args)
//	{
//		//declare string variable
//		String str="Thamica",reverse="";
//		
//		//taking characters from end and
//		for(int i=(str.length()-1);i>=0;--i)
//		{
//			//store it into another variable char by char using charAt()
//	        reverse=reverse+str.charAt(i);
//		}
//		if(str.toLowerCase().equals(reverse.toLowerCase()))
//		{
//			System.out.println("palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//		
//	}
//}


//palindrome numbers using while loop

public class Palindrome
{
	public static void main(String[] args)
	{
		int num=9999,reversed=0;
		int original=num; //the number to be checked with
		
		while(num!=0)
		{
			//last digit of the num is stored in remainder
			int remainder=num%10;
			
			reversed=reversed*10+remainder;
			//the last digit is removed from num
			num=num/10;
		}
		if(original==reversed)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}
}




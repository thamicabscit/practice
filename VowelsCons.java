package javaprograms.strings;

import java.util.Scanner;

//public class VowelsCons {
//
//	public static void main(String[] args) {
//		
//		String str="HelloWorld";
//		str=str.toLowerCase();
//		int vowels=0,cons=0;
//		for(int i=0;i<str.length();i++)
//		{
//			char ch=str.charAt(i);
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
//			{
//				
//				vowels++;
//			}
//			else if(ch>='a'&& ch<='z')
//			{
//			
//				cons++;
//			}
//		}
//
//		System.out.println(vowels);
//		System.out.println(cons);
//	}
//
//}



//printing vowels and consonants
public class VowelsCons
{
	public static void main(String args[])
	{
	 
		String str="HelloWorld";
		str=str.toLowerCase();
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.print(ch+" ");
			
			}
			
		}
		  System.out.println("\nCons"); 
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' && !(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
			{
				
				System.out.print(ch+" ");
			}
		}
		
		
		
		
		
		
		    }
		

	}





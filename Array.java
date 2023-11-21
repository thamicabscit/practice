package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

//duplicate elements
//public class Array {
//
//	public static void main(String[] args) {
//		int count=0;
//		int array[]= {1,2,3,4,4,5,5,6,7,7};
//		for(int i=0;i<array.length;i++)
//		{
//			for(int j=i+1;j<array.length;j++)
//			{
//				if(array[i]==array[j]&&(i!=j))
//				{
//					System.out.println(array[j]);
//					count++;
//				}
//			}
//		}
//		System.out.println("no.of.repeated elements:"+count);
//
//	}
//
//}

//unique elements
//public class Array
//{
//	public static void main(String args[])
//	{
//		int i,j;
//		int[] array= {1,2,3,4,5,5,6,6,7,8,8};
//		
//		for( i=0;i<array.length;i++)
//		{
//			for(j=0;j<array.length;j++)
//			{
//				if(array[i]==array[j])
//				{
//					break;
//				}
//			}
//			//if the number is not not printed already then print it
//			if(i==j)
//			{
//				System.out.println(array[i]);
//				
//			}
//		}
//		
//		
//	}
//}

//frequency of duplicate elements
		public class Array
		{
			public static void main(String args[])
			{

				
				 int[] array = { 2, 3, 5, 4, 3, 1, 3, 3,2, 1, };
			      
			      
				  Arrays.sort(array);
			      
			      
			      int j,frequency;
			     
			      
			      
			      for(int i=0; i<array.length; i++)
			      {
			         frequency = 1;
			         for(j=i+1; j<array.length; j++)
			         {
			            if(array[j] == array[i])
			            {
			               frequency++;
			            } 
			            else
			            {
			               break;
			            }
			         }
			         //to print like 1 count 3,2 count 4
			         i=j-1;
			         if(frequency > 1){
			         
			          
			            System.out.println(array[i] + "count: " + frequency);
			         }
			      }
				
				
				
			}
		}
				
				
				
				
				
				
				
				
				
				
				
				
				

		
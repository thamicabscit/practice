package javaprograms;

import java.util.Arrays;

//public class CommonElm2Array {
//
//	public static void main(String[] args) {
//	
//		int[] array1= {1,2,3,4};
//		int[] array2= {1,2,7,8};
//		int i,j;
//		
//		for(i=0;i<array1.length;i++)
//		{
//			for( j=0;j<array2.length;j++)
//			{
//				if(array1[i]==array2[j])
//				{
//					System.out.println(array1[i]);
//				}
//				
//				
//			}
//		}
//		
//
//	}
//
//}

public class CommonElm2Array
{
	public static void main(String args[])
	{
		int[] array1= {1,2,3,4,5};
		int[] array2= {1,2,3,4,5};
		
		int length=array1.length < array2.length?
				array1.length:array2.length;
		
		int result[]=new int[length];
		int i;
		for( i=0;i<length;i++)
		{
			result[i]=array1[i]+array2[i];
		}
		
		//to find sum of all elm
		int sum=0;
		for(int j=0;j<result.length;j++)
		{
			 sum=sum+result[j];
		}
		System.out.println(sum);
		System.out.println(Arrays.toString(result));
	}
}















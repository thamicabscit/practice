package javaprograms;

import java.lang.reflect.Array;

//public class ArrayAllpairs {
//
//	public static void main(String[] args) {
//		int[] array= {1,2,3,4,5,5,7,8,9};
//		int num=10;
//		for(int i=0;i<array.length;i++)
//		{
//			for(int j=i+1;j<array.length;j++)
//			{
//				if(array[i]+array[j]==num)
//				{
//					System.out.println(array[i]+" "+array[j]+" "+num);
//				}
//			}
//		}
//		
//
//	}
//
//}
public class ArrayAllpairs
{
	public static void main(String args[])
	{
		int sum=0;
		int[] array= {1,2,3,4,5,6,7,8};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				 sum=array[i]+array[j];
			}
			System.out.println(sum);
		}
		
	}
}

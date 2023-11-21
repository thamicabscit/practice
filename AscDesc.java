package javaprograms;

public class AscDesc {

	public static void main(String[] args) {
		
		int[] array= {5,3,4,2,8,1,6,7,8,9,10};
		int temp;
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length/2;j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		for(int j=array.length/2;j<array.length-1;j++)
		{
			if(array[j]<array[j+1])
			{
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}

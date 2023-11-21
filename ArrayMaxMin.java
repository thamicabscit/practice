package javaprograms;

public class ArrayMaxMin {

	public static void main(String[] args) {

		int array[]= {1,2,3,4,5,6,7};
		int max=array[0];
		//array.length to avoid outofbound exception
		for( int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			
		}
		System.out.println(max);
		
	}

}
